import java.util.*;
import java.io.FileWriter;
/**
 * Write a description of class DataCollector here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        controller.compareEffecientSortsSorted();
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
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000, 20000};//, 10000, 15000, 25000};
        int [] numberOfItemsMedium = {1000, 10000, 25000, 50000, 75000, 100000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500, 10000, 25000, 50000};
        int [] numberOfItemsQuicksort = {1000, 2500, 5000, 7500};
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
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        line1 = line1.concat("," + String.valueOf(timeMergeSortSortedInts(i, j)));
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
                        line1 = line1.concat("," + String.valueOf(timeBubbleSortSortedInts(i, j)));
                        line2 = line2.concat("," + Long.toString(timeInsertionSortSortedInts(i, j)));
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
            FileWriter output = new FileWriter("Project1_compareAllSortsSortedInts.csv"); 
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
}
