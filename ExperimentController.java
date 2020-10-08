
import java.util.*;
import java.io.FileWriter;
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExperimentController
{
    String[] sortedStrings = {"aa","ab","ac","ad","ae","af","ag","ah","ai","aj","ak","al","am","an","ao","ap","aq","ar","as","at","au","av","aw","ax","ay"};

    /**
     * Creates an instance of this class and runs a series of tests for...
     *
     * @param   args  Can be used to pass information from the user to be used in the code.
     */
    public static void main (String [] args) {
        ExperimentController controller = new ExperimentController();
        //controller.sortTimes();
    }
    
    /**
     * Returns the amount of time to sort an array of random integers using Bubble Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeBubbleSortRandInts(int numberOfItems, int seed) {
        BubbleSort bubbleInt = new BubbleSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = random.nextInt(201);
        }
        long startTime = System.currentTimeMillis();
        bubbleInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted integers using Bubble Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeBubbleSortSortedInts(int numberOfItems, int seed) {
        BubbleSort bubbleInt = new BubbleSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = i;
        }
        long startTime = System.currentTimeMillis();
        bubbleInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted integers using Bubble Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeBubbleSortWorstCaseInts(int numberOfItems, int seed) {
        BubbleSort bubbleInt = new BubbleSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = numberOfItems - i - 1;
        }
        long startTime = System.currentTimeMillis();
        bubbleInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random strings using Bubble Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeBubbleSortRandStrings(int numberOfItems, int seed) {
        BubbleSort bubbleString = new BubbleSort();
        Random random = new Random(seed);
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            int idx = random.nextInt(sortedStrings.length);
            stringArray[i] = sortedStrings[idx];
        }
        long startTime = System.currentTimeMillis();
        bubbleString.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted strings using Bubble Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeBubbleSortSortedStrings(int numberOfItems, int seed) {
        BubbleSort bubbleString = new BubbleSort();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[0];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[1];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[8];
            else StringArray[i]=sortedStrings[9];
        }
        long startTime = System.currentTimeMillis();
        bubbleString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted strings using Bubble Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeBubbleSortWorstCaseStrings(int numberOfItems, int seed) {
        BubbleSort bubbleString = new BubbleSort();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[9];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[8];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[1];
            else StringArray[i]=sortedStrings[0];
        }
        long startTime = System.currentTimeMillis();
        bubbleString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random integers using Insertion Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeInsertionSortRandInts(int numberOfItems, int seed) {
        InsertionSort insertionInt = new InsertionSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = random.nextInt(201);
        }
        long startTime = System.currentTimeMillis();
        insertionInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted integers using Insertion Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeInsertionSortSortedInts(int numberOfItems, int seed) {
        InsertionSort insertionInt = new InsertionSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = i;
        }
        long startTime = System.currentTimeMillis();
        insertionInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted integers using Insertion Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeInsertionSortWorstCaseInts(int numberOfItems, int seed) {
        InsertionSort insertionInt = new InsertionSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = numberOfItems - i - 1;
        }
        long startTime = System.currentTimeMillis();
        insertionInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random strings using Insertion Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeInsertionSortRandStrings(int numberOfItems, int seed) {
        InsertionSort insertionString = new InsertionSort();
        Random random = new Random(seed);
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            int idx = random.nextInt(sortedStrings.length);
            stringArray[i] = sortedStrings[idx];
        }
        long startTime = System.currentTimeMillis();
        insertionString.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted strings using Insertion Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeInsertionSortSortedStrings(int numberOfItems, int seed) {
        InsertionSort insertionString = new InsertionSort();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[0];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[1];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[8];
            else StringArray[i]=sortedStrings[9];
        }
        long startTime = System.currentTimeMillis();
        insertionString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted strings using Insertion Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeInsertionSortWorstCaseStrings(int numberOfItems, int seed) {
        InsertionSort insertionString = new InsertionSort();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[9];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[8];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[1];
            else StringArray[i]=sortedStrings[0];
        }
        long startTime = System.currentTimeMillis();
        insertionString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random integers using Quick Sort
     * with the first index as the pivot.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortFirstRandInts(int numberOfItems, int seed) {
        QuicksortFirst quicksortFirstInt = new QuicksortFirst();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = random.nextInt(201);
        }
        long startTime = System.currentTimeMillis();
        quicksortFirstInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted integers using Quick Sort
     * with the first index as the pivot.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortFirstSortedInts(int numberOfItems, int seed) {
        QuicksortFirst quicksortFirstInt = new QuicksortFirst();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = i;
        }
        long startTime = System.currentTimeMillis();
        quicksortFirstInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted integers using Quick Sort
     * with the first index as the pivot.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortFirstWorstCaseInts(int numberOfItems, int seed) {
        QuicksortFirst quicksortFirstInt = new QuicksortFirst();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = numberOfItems - i - 1;
        }
        long startTime = System.currentTimeMillis();
        quicksortFirstInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random strings using 
     * Quicksort with the first index as the pivot
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortFirstRandStrings(int numberOfItems, int seed) {
        QuicksortFirst quicksortFirstString = new QuicksortFirst();
        Random random = new Random(seed);
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            int idx = random.nextInt(sortedStrings.length);
            stringArray[i] = sortedStrings[idx];
        }
        long startTime = System.currentTimeMillis();
        quicksortFirstString.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted strings using  
     * Quicksort with the first index as the pivot
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortFirstSortedStrings(int numberOfItems, int seed) {
        QuicksortFirst quicksortFirstString = new QuicksortFirst();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[0];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[1];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[8];
            else StringArray[i]=sortedStrings[9];
        }
        long startTime = System.currentTimeMillis();
        quicksortFirstString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted strings using 
     * Quicksort with the first index as the pivot
     * 
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortFirstWorstCaseStrings(int numberOfItems, int seed) {
        QuicksortFirst quicksortFirstString = new QuicksortFirst();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[9];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[8];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[1];
            else StringArray[i]=sortedStrings[0];
        }
        long startTime = System.currentTimeMillis();
        quicksortFirstString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random integers using Quick Sort
     * with the median index as the pivot.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortMedianRandInts(int numberOfItems, int seed) {
        QuicksortMedian QuicksortMedianInt = new QuicksortMedian();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = random.nextInt(201);
        }
        long startTime = System.currentTimeMillis();
        QuicksortMedianInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted integers using Quick Sort
     * with the median index as the pivot.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortMedianSortedInts(int numberOfItems, int seed) {
        QuicksortMedian QuicksortMedianInt = new QuicksortMedian();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = i;
        }
        long startTime = System.currentTimeMillis();
        QuicksortMedianInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted integers using Quick Sort
     * with the median index as the pivot.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortMedianWorstCaseInts(int numberOfItems, int seed) {
        QuicksortMedian quicksortMedianInt = new QuicksortMedian();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = numberOfItems - i - 1;
        }
        long startTime = System.currentTimeMillis();
        quicksortMedianInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random strings using 
     * Quicksort with the median index as the pivot
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortMedianRandStrings(int numberOfItems, int seed) {
        QuicksortMedian quicksortMedianString = new QuicksortMedian();
        Random random = new Random(seed);
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            int idx = random.nextInt(sortedStrings.length);
            stringArray[i] = sortedStrings[idx];
        }
        long startTime = System.currentTimeMillis();
        quicksortMedianString.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted strings using  
     * Quicksort with the median index as the pivot
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortMedianSortedStrings(int numberOfItems, int seed) {
        QuicksortMedian quicksortMedianString = new QuicksortMedian();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[0];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[1];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[8];
            else StringArray[i]=sortedStrings[9];
        }
        long startTime = System.currentTimeMillis();
        quicksortMedianString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted strings using 
     * Quicksort with the median index as the pivot
     * 
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortMedianWorstCaseStrings(int numberOfItems, int seed) {
        QuicksortMedian quicksortMedianString = new QuicksortMedian();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[9];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[8];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[1];
            else StringArray[i]=sortedStrings[0];
        }
        long startTime = System.currentTimeMillis();
        quicksortMedianString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random integers using Quick Sort
     * with a random index as the pivot.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortRandRandInts(int numberOfItems, int seed) {
        QuicksortRand quicksortRandInt = new QuicksortRand(seed);
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = random.nextInt(201);
        }
        long startTime = System.currentTimeMillis();
        quicksortRandInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted integers using Quick Sort
     * with a random index as the pivot.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortRandSortedInts(int numberOfItems, int seed) {
        QuicksortRand quicksortRandInt = new QuicksortRand(seed);
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = i;
        }
        long startTime = System.currentTimeMillis();
        quicksortRandInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted integers using Quick Sort
     * with a random index as the pivot.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortRandWorstCaseInts(int numberOfItems, int seed) {
        QuicksortRand quicksortRandInt = new QuicksortRand(seed);
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = numberOfItems - i - 1;
        }
        long startTime = System.currentTimeMillis();
        quicksortRandInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random strings using 
     * Quicksort with a random index as the pivot
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortRandRandStrings(int numberOfItems, int seed) {
        QuicksortRand quicksortRandString = new QuicksortRand(seed);
        Random random = new Random(seed);
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            int idx = random.nextInt(sortedStrings.length);
            stringArray[i] = sortedStrings[idx];
        }
        long startTime = System.currentTimeMillis();
        quicksortRandString.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted strings using  
     * Quicksort with a random index as the pivot
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortRandSortedStrings(int numberOfItems, int seed) {
        QuicksortRand quicksortRandString = new QuicksortRand(seed);
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[0];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[1];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[8];
            else StringArray[i]=sortedStrings[9];
        }
        long startTime = System.currentTimeMillis();
        quicksortRandString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted strings using 
     * Quicksort with a random index as the pivot
     * 
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeQuicksortRandWorstCaseStrings(int numberOfItems, int seed) {
        QuicksortRand quicksortRandString = new QuicksortRand(seed);
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[9];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[8];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[1];
            else StringArray[i]=sortedStrings[0];
        }
        long startTime = System.currentTimeMillis();
        quicksortRandString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random integers using Merge Sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeMergeSortRandInts(int numberOfItems, int seed) {
        MergeSort mergeSortInt = new MergeSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = random.nextInt(201);
        }
        long startTime = System.currentTimeMillis();
        mergeSortInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }

    /**
     * Returns the amount of time to sort an array of sorted integers using Merge Sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeMergeSortSortedInts(int numberOfItems, int seed) {
        MergeSort MergeSortInt = new MergeSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = i;
        }
        long startTime = System.currentTimeMillis();
        MergeSortInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }

    /**
     * Returns the amount of time to sort an array of reverse sorted integers using Merge Sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeMergeSortWorstCaseInts(int numberOfItems, int seed) {
        MergeSort MergeSortInt = new MergeSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = numberOfItems - i - 1;
        }
        long startTime = System.currentTimeMillis();
        MergeSortInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random strings using Merge Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeMergeSortRandStrings(int numberOfItems, int seed) {
        MergeSort mergeSortString = new MergeSort();
        Random random = new Random(seed);
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            int idx = random.nextInt(sortedStrings.length);
            stringArray[i] = sortedStrings[idx];
        }
        long startTime = System.currentTimeMillis();
        mergeSortString.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted strings using Merge Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeMergeSortSortedStrings(int numberOfItems, int seed) {
        MergeSort mergeSortString = new MergeSort();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[0];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[1];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[8];
            else StringArray[i]=sortedStrings[9];
        }
        long startTime = System.currentTimeMillis();
        mergeSortString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted strings using Merge Sort
     * 
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeMergeSortWorstCaseStrings(int numberOfItems, int seed) {
        MergeSort mergeSortString = new MergeSort();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[9];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[8];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[1];
            else StringArray[i]=sortedStrings[0];
        }
        long startTime = System.currentTimeMillis();
        mergeSortString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }

    /**
     * Returns the amount of time to sort an array of random integers using Merge Sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeSelectionSortRandInts(int numberOfItems, int seed) {
        SelectionSort SelectionSortInt = new SelectionSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = random.nextInt(201);
        }
        long startTime = System.currentTimeMillis();
        SelectionSortInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }

    /**
     * Returns the amount of time to sort an array of sorted integers using Merge Sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeSelectionSortSortedInts(int numberOfItems, int seed) {
        SelectionSort SelectionSortInt = new SelectionSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = i;
        }
        long startTime = System.currentTimeMillis();
        SelectionSortInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }

    /**
     * Returns the amount of time to sort an array of reverse sorted integers using Merge Sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeSelectionSortWorstCaseInts(int numberOfItems, int seed) {
        SelectionSort SelectionSortInt = new SelectionSort();
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = numberOfItems - i - 1;
        }
        long startTime = System.currentTimeMillis();
        SelectionSortInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random strings using Selection Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeSelectionSortRandStrings(int numberOfItems, int seed) {
        SelectionSort selectionSortString = new SelectionSort();
        Random random = new Random(seed);
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            int idx = random.nextInt(sortedStrings.length);
            stringArray[i] = sortedStrings[idx];
        }
        long startTime = System.currentTimeMillis();
        selectionSortString.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted strings using Selection Sort
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeSelectionSortSortedStrings(int numberOfItems, int seed) {
        SelectionSort selectionSortString = new SelectionSort();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[0];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[1];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[8];
            else StringArray[i]=sortedStrings[9];
        }
        long startTime = System.currentTimeMillis();
        selectionSortString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted strings using Selection Sort
     * 
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to append all items
     */
    public long timeSelectionSortWorstCaseStrings(int numberOfItems, int seed) {
        SelectionSort selectionSortString = new SelectionSort();
        Random random = new Random(seed);
        String [] StringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) StringArray[i]=sortedStrings[9];
            else if (i < (numberOfItems*(2/10))) StringArray[i]=sortedStrings[8];
            else if (i < (numberOfItems*(3/10))) StringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(4/10))) StringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(5/10))) StringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(6/10))) StringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(7/10))) StringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(8/10))) StringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(9/10))) StringArray[i]=sortedStrings[1];
            else StringArray[i]=sortedStrings[0];
        }
        long startTime = System.currentTimeMillis();
        selectionSortString.sort(StringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }

    /**
     * Runs a series of tests of sorting various types of data of various lengths. 
     * Different sorting algorithms are used during the tests. Writes the time for 
     * each test to a comma delimited file.
     */
    public void sortTimes() {
        String line1 = new String();
        String line2 = new String();
        String line3 = new String();
        String line4 = new String();
        String line5 = new String();
        String line6 = new String();
        String line7 = new String();
        int [] seed = {117, 2100, 777};
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000};//, 10000, 15000, 25000};
        int [] numberOfItemsMedium = {1000, 10000, 25000, 50000, 75000, 100000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000};
        try {
            FileWriter output = new FileWriter("Lab6_Output.csv"); 
            // initialize the FileWriter object where the results will be printed
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                Random random = new Random(j);
                for (int i: numberOfItemsFast) { // i steps through using the array numberOfItem's values
                    //line1 = "seed: ," + j + ", No. Items: ," + i + ", timeSearchDefault Trials: "; 
                    //line2 = "seed: ," + j + ", No. Items: ," + i + ", timeSearchIterator Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //searchTarget = random.nextInt(201);
                        //line1 = line1.concat("," + String.valueOf(timeSearchDefault(i, j)));
                        //line2 = line2.concat("," + Long.toString(timeSearchIterator(i, j)));
                    }
                    //output.write(line1 + "\n"); // writes the line and starts a new line
                    //output.write(line2 + "\n");
                }
            }
            for (int j: seed) { // taken from lecture: j steps through using the array seed's values
                for (int i: numberOfItemsLong) { // i steps through using the array numberOfItem's values
                    //line1 = "seed: ," + j + ", No. Items: ," + i + ", timeSearchDefault Trials: "; 
                    //line2 = "seed: ," + j + ", No. Items: ," + i + ", timeToString Trials:";
                    // creates header for data
                    for (int k = 0; k < 10; k ++) { // run each method 5 times to get an average
                        //line1 = line1.concat("," + String.valueOf(timeSearchDefault(i, j)));
                        //line2 = line2.concat("," + Long.toString(timeToString(i, j)));
                    }
                    //output.write(line1 + "\n"); // writes the line and starts a new line
                    //output.write(line2 + "\n");
                }
            }
            output.close(); // closes the FileWriter
        } catch (Exception e){ //handles necessary exceptions
            System.out.println("Exception occured " + e);
        }
    }
}
