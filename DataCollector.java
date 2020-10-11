import java.util.*;
import java.io.FileWriter;
/**
 * Write a description of class DataCollector here.
 *
 * @author Benjamin Gersten and Taylor Strong
 * @version Oct 10, 2020
 */
public class DataCollector extends ExperimentController
{
    /**
     * Creates an instance of this class and runs a series of tests for...
     *
     * @param   args  Can be used to pass information from the user to be used in the code.
     */
    public static void main (String [] args) {
        DataCollector controller = new DataCollector();
        //controller.compareEffecientSortsSorted();
        controller.compareAllSortsSortedInts();
        //controller.compareAllSortsRandInts();
        //controller.compareAllSortsWorstCaseInts();
        //controller.compareAllSortsSortedStrings();
        //controller.compareAllSortsRandStrings();
        //controller.compareAllSortsWorstCaseStrings();
        
        //controller.timeInsertionSortSortedInts(25000, 117);
        //controller.timeInsertionSortWorstCaseInts(25000, 117);
    }
    
    /**
     * Runs a series of tests of sorting various types of data of various lengths. 
     * Different sorting algorithms are used during the tests. Writes the time for 
     * each test to a comma delimited file.
     */
    public void compareEffecientSortsSorted() {
        String line1 = new String();
        String line2 = new String();
        String line3 = new String();
        String line4 = new String();
        String line5 = new String();
        String line6 = new String();
        int [] seed = {117, 2100, 777};
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000, 20000};//, 10000, 15000, 25000};
        int [] numberOfItemsMedium = {1000, 10000, 25000, 50000, 75000, 100000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500};
        try {
            FileWriter output = new FileWriter("Project1_compareEffecientSorts.csv"); 
            // initialize the FileWriter object where the results will be printed
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", FirstPivQuicksort Sorted Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", RandPivQuicksort Sorted Trials: "; 
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", MedianPivQuicksort Sorted Trials: "; 
                    line4 = "seed: ," + j + ", No. Items: ," + i + ", Arrays.Quicksort Sorted Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeQuicksortFirstSortedInts(i, j)));
                        line2 = line2.concat("," + Long.toString(timeQuicksortRandSortedInts(i, j)));
                        line3 = line3.concat("," + Long.toString(timeQuicksortMedianSortedInts(i, j)));
                        line4 = line4.concat("," + Long.toString(timeJavaQuicksortSortedInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2  + "\n");
                    output.write(line3 + "\n");
                    output.write(line4 + "\n");
                }
            }
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", CustomMergesort Sorted Trials: "; 
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", Collections.Mergesort Sorted Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        line1 = line1.concat("," + String.valueOf(timeMergeSortSortedStrings(i, j)));
                        line2 = line2.concat("," + Long.toString(timeJavaMergesortSortedStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2 + "\n");
                }
            }
            output.write("\n"); // begin random case
            output.write("Random Trials");
            output.write("\n");
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", FirstPivQuicksort Random Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", RandPivQuicksort Random Trials: "; 
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", MedianPivQuicksort Random Trials: "; 
                    line4 = "seed: ," + j + ", No. Items: ," + i + ", Arrays.Quicksort Random Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeQuicksortFirstRandInts(i, j)));
                        line2 = line2.concat("," + Long.toString(timeQuicksortRandRandInts(i, j)));
                        line3 = line3.concat("," + Long.toString(timeQuicksortMedianRandInts(i, j)));
                        line4 = line4.concat("," + Long.toString(timeJavaQuicksortRandInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2  + "\n");
                    output.write(line3 + "\n");
                    output.write(line4 + "\n");
                }
            }
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", CustomMergesort Random Trials: "; 
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", Collections.Mergesort Random Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        line1 = line1.concat("," + String.valueOf(timeMergeSortRandStrings(i, j)));
                        line2 = line2.concat("," + Long.toString(timeJavaMergesortRandStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2 + "\n");
                }
            }
            output.write("\n"); // begin worst case
            output.write("Worst Case Trials");
            output.write("\n");
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", FirstPivQuicksort Worst Case Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", RandPivQuicksort Worst Case Trials: "; 
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", MedianPivQuicksort Worst Case Trials: "; 
                    line4 = "seed: ," + j + ", No. Items: ," + i + ", Arrays.Quicksort Worst Case Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeQuicksortFirstWorstCaseInts(i, j)));
                        line2 = line2.concat("," + Long.toString(timeQuicksortRandWorstCaseInts(i, j)));
                        line3 = line3.concat("," + Long.toString(timeQuicksortMedianWorstCaseInts(i, j)));
                        line4 = line4.concat("," + Long.toString(timeJavaQuicksortWorstCaseInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2  + "\n");
                    output.write(line3 + "\n");
                    output.write(line4 + "\n");
                }
            }
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", CustomMergesort Worst Case Trials: "; 
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", Collections.Mergesort Worst Case Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        line1 = line1.concat("," + String.valueOf(timeMergeSortWorstCaseStrings(i, j)));
                        line2 = line2.concat("," + Long.toString(timeJavaMergesortWorstCaseStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2 + "\n");
                }
            }
            output.close(); // closes the FileWriter
        } catch (Exception e){ //handles necessary exceptions
            System.out.println("Exception occured " + e);
        }
    }
    
    public void compareAllSortsSortedInts() {
        String line1 = new String();
        String line2 = new String();
        String line3 = new String();
        int [] seed = {117, 2100, 777};
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000, 25000, 50000};
        int [] numberOfItemsMedium = {000, 2500, 5000, 7500, 10000, 25000, 50000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500, 10000, 25000, 50000, 75000, 100000, 500000, 1000000, 2000000};
        int [] numberOfItemsQuicksort = {1000, 2500, 5000, 6000};
        try {
            FileWriter output = new FileWriter("Project1_compareAllSortsSortedInts.csv"); 
            // initialize the FileWriter object where the results will be printed
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsQuicksort) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", FirstPivQuicksort Sorted Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", RandPivQuicksort Sorted Trials: "; 
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", MedianPivQuicksort Sorted Trials: "; 
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeQuicksortFirstSortedInts(i, j)));
                        line2 = line2.concat("," + Long.toString(timeQuicksortRandSortedInts(i, j)));
                        line3 = line3.concat("," + Long.toString(timeQuicksortMedianSortedInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2  + "\n");
                    output.write(line3 + "\n");
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Mergesort Sorted Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", Insertion Sorted Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeMergeSortSortedInts(i, j)));
                        line2 = line2.concat("," + String.valueOf(timeInsertionSortSortedInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2 + "\n");
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsMedium) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Bubble Sorted Trials: "; 
                    //line2 = "seed: ," + j + ", No. Items: ," + i + ", Insertion Sorted Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        line1 = line1.concat("," + String.valueOf(timeBubbleSortSortedInts(i, j)));
                        //line2 = line2.concat("," + Long.toString(timeInsertionSortSortedInts(i, j)));
                        //line2 = line2.concat("," + String.valueOf(timeInsertionSortSortedInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    //output.write(line2 + "\n");
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", SelectionSort Sorted Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeSelectionSortSortedInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line;
                }
            }
            output.close(); // closes the FileWriter
        } catch (Exception e){ //handles necessary exceptions
            System.out.println("Exception occured " + e);
        }
    }
    
    public void compareAllSortsRandInts() {
        String line1 = new String();
        String line2 = new String();
        String line3 = new String();
        int [] seed = {117, 2100, 777};
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000, 20000};//, 10000, 15000, 25000};
        int [] numberOfItemsMedium = {1000, 10000, 25000, 50000, 75000, 100000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500, 10000, 25000, 50000};
        int [] numberOfItemsQuicksort = {1000, 2500, 5000, 7500};
        try {
            FileWriter output = new FileWriter("Project1_compareAllSortsRandInts.csv"); 
            // initialize the FileWriter object where the results will be printed
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsQuicksort) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", FirstPivQuicksort Random Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", RandPivQuicksort Random Trials: "; 
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", MedianPivQuicksort Random Trials: "; 
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeQuicksortFirstRandInts(i, j)));
                        line2 = line2.concat("," + Long.toString(timeQuicksortRandRandInts(i, j)));
                        line3 = line3.concat("," + Long.toString(timeQuicksortMedianRandInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2  + "\n");
                    output.write(line3 + "\n");
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Mergesort Random Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeMergeSortRandInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Bubble Random Trials: "; 
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", Insertion Random Trials:";
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", SelectionSort Random Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        line1 = line1.concat("," + String.valueOf(timeBubbleSortRandInts(i, j)));
                        line2 = line2.concat("," + Long.toString(timeInsertionSortRandInts(i, j)));
                        line3 = line3.concat("," + String.valueOf(timeSelectionSortRandInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2 + "\n");
                    output.write(line3 + "\n");
                }
            }
            output.close(); // closes the FileWriter
        } catch (Exception e){ //handles necessary exceptions
            System.out.println("Exception occured " + e);
        }
    }
    
    public void compareAllSortsWorstCaseInts() {
        String line1 = new String();
        String line2 = new String();
        String line3 = new String();
        int [] seed = {117, 2100, 777};
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000, 20000};//, 10000, 15000, 25000};
        int [] numberOfItemsMedium = {1000, 10000, 25000, 50000, 75000, 100000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500, 10000, 25000, 50000};
        int [] numberOfItemsQuicksort = {1000, 2500, 5000, 7500};
        try {
            FileWriter output = new FileWriter("Project1_compareAllSortsWorstCaseInts.csv"); 
            // initialize the FileWriter object where the results will be printed
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsQuicksort) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", FirstPivQuicksort Worst Case Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", RandPivQuicksort Worst Case Trials: "; 
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", MedianPivQuicksort Worst Case Trials: "; 
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeQuicksortFirstWorstCaseInts(i, j)));
                        line2 = line2.concat("," + Long.toString(timeQuicksortRandWorstCaseInts(i, j)));
                        line3 = line3.concat("," + Long.toString(timeQuicksortMedianWorstCaseInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2  + "\n");
                    output.write(line3 + "\n");
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Mergesort Worst Case Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeMergeSortWorstCaseInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Bubble Worst Case Trials: "; 
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", Insertion Worst Case Trials:";
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", SelectionSort Worst Case Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        line1 = line1.concat("," + String.valueOf(timeBubbleSortWorstCaseInts(i, j)));
                        line2 = line2.concat("," + Long.toString(timeInsertionSortWorstCaseInts(i, j)));
                        line3 = line3.concat("," + String.valueOf(timeSelectionSortWorstCaseInts(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2 + "\n");
                    output.write(line3 + "\n");
                }
            }
            output.close(); // closes the FileWriter
        } catch (Exception e){ //handles necessary exceptions
            System.out.println("Exception occured " + e);
        }
    }
    
    //Strings
    public void compareAllSortsSortedStrings() {
        String line1 = new String();
        String line2 = new String();
        String line3 = new String();
        int [] seed = {117, 2100, 777};
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000, 20000};//, 10000, 15000, 25000};
        int [] numberOfItemsMedium = {1000, 10000, 25000, 50000, 75000, 100000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500, 10000, 25000, 50000};
        int [] numberOfItemsQuicksort = {1000, 2500, 5000, 7500};
        try {
            FileWriter output = new FileWriter("Project1_compareAllSortsSortedStrings.csv"); 
            // initialize the FileWriter object where the results will be printed
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsQuicksort) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", FirstPivQuicksort Sorted Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", RandPivQuicksort Sorted Trials: "; 
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", MedianPivQuicksort Sorted Trials: "; 
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeQuicksortFirstSortedStrings(i, j)));
                        line2 = line2.concat("," + Long.toString(timeQuicksortRandSortedStrings(i, j)));
                        line3 = line3.concat("," + Long.toString(timeQuicksortMedianSortedStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2  + "\n");
                    output.write(line3 + "\n");
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Mergesort Sorted Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeMergeSortSortedStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsMedium) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Bubble Sorted Trials: "; 
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", Insertion Sorted Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        line1 = line1.concat("," + String.valueOf(timeBubbleSortSortedStrings(i, j)));
                        line2 = line2.concat("," + Long.toString(timeInsertionSortSortedStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2 + "\n");
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", SelectionSort Random Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeSelectionSortSortedStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line;
                }
            }
            output.close(); // closes the FileWriter
        } catch (Exception e){ //handles necessary exceptions
            System.out.println("Exception occured " + e);
        }
    }
    
    public void compareAllSortsRandStrings() {
        String line1 = new String();
        String line2 = new String();
        String line3 = new String();
        int [] seed = {117, 2100, 777};
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000, 20000};//, 10000, 15000, 25000};
        int [] numberOfItemsMedium = {1000, 10000, 25000, 50000, 75000, 100000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500, 10000, 25000, 50000};
        int [] numberOfItemsQuicksort = {1000, 2500, 5000, 7500};
        try {
            FileWriter output = new FileWriter("Project1_compareAllSortsRandStrings.csv"); 
            // initialize the FileWriter object where the results will be printed
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsQuicksort) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", FirstPivQuicksort Random Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", RandPivQuicksort Random Trials: "; 
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", MedianPivQuicksort Random Trials: "; 
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeQuicksortFirstRandStrings(i, j)));
                        line2 = line2.concat("," + Long.toString(timeQuicksortRandRandStrings(i, j)));
                        line3 = line3.concat("," + Long.toString(timeQuicksortMedianRandStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2  + "\n");
                    output.write(line3 + "\n");
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Mergesort Random Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeMergeSortRandStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Bubble Random Trials: "; 
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", Insertion Random Trials:";
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", SelectionSort Random Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        line1 = line1.concat("," + String.valueOf(timeBubbleSortRandStrings(i, j)));
                        line2 = line2.concat("," + Long.toString(timeInsertionSortRandStrings(i, j)));
                        line3 = line3.concat("," + String.valueOf(timeSelectionSortRandStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2 + "\n");
                    output.write(line3 + "\n");
                }
            }
            output.close(); // closes the FileWriter
        } catch (Exception e){ //handles necessary exceptions
            System.out.println("Exception occured " + e);
        }
    }
    
    public void compareAllSortsWorstCaseStrings() {
        String line1 = new String();
        String line2 = new String();
        String line3 = new String();
        int [] seed = {117, 2100, 777};
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000, 20000};//, 10000, 15000, 25000};
        int [] numberOfItemsMedium = {1000, 10000, 25000, 50000, 75000, 100000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500, 10000, 25000, 50000};
        int [] numberOfItemsQuicksort = {1000, 2500, 5000, 7500};
        try {
            FileWriter output = new FileWriter("Project1_compareAllSortsWorstCaseStrings.csv"); 
            // initialize the FileWriter object where the results will be printed
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsQuicksort) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", FirstPivQuicksort Worst Case Trials: ";
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", RandPivQuicksort Worst Case Trials: "; 
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", MedianPivQuicksort Worst Case Trials: "; 
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeQuicksortFirstWorstCaseStrings(i, j)));
                        line2 = line2.concat("," + Long.toString(timeQuicksortRandWorstCaseStrings(i, j)));
                        line3 = line3.concat("," + Long.toString(timeQuicksortMedianWorstCaseStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2  + "\n");
                    output.write(line3 + "\n");
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Mergesort Worst Case Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeMergeSortWorstCaseStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                }
            }
            
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    line1 = "seed: ," + j + ", No. Items: ," + i + ", Bubble Worst Case Trials: "; 
                    line2 = "seed: ," + j + ", No. Items: ," + i + ", Insertion Worst Case Trials:";
                    line3 = "seed: ," + j + ", No. Items: ," + i + ", SelectionSort Worst Case Trials: ";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        line1 = line1.concat("," + String.valueOf(timeBubbleSortWorstCaseStrings(i, j)));
                        line2 = line2.concat("," + Long.toString(timeInsertionSortWorstCaseStrings(i, j)));
                        line3 = line3.concat("," + String.valueOf(timeSelectionSortWorstCaseStrings(i, j)));
                    }
                    output.write(line1 + "\n"); // writes the line and starts a new line
                    output.write(line2 + "\n");
                    output.write(line3 + "\n");
                }
            }
            output.close(); // closes the FileWriter
        } catch (Exception e){ //handles necessary exceptions
            System.out.println("Exception occured " + e);
        }
    }
    
}
