import java.util.*;
import java.io.FileWriter;
/**
 * Creates arrays of various types and tests various sorting algorithms in sorting them. Runtime data is collected
 * and added to a comma deliminated file by some methods.
 *
 * @author Benjamin Gersten and Taylor Strong
 * @version Oct 10, 2020
 */
public class ExperimentController {
    String[] sortedStrings = {"aa","ab","ac","ad","ae","af","ag","ah","ai","aj","ak","al","am","an","ao","ap","aq","ar","as","at","au","av","aw","ax","ay"};

    /**
     * Creates an instance of this class and runs a series of tests for...
     *
     * @param   args  Can be used to pass information from the user to be used in the code.
     */
    /*
    public static void main (String [] args) {
        ExperimentController controller = new ExperimentController();
        //controller.sortTimes();
    } */
    
    /**
     * Creates an array of sorted ints of specified length.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @return  array of sorted ints
     */
    public int[] createSortedInts(int numberOfItems) {
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = i;
        }
        return intArray;
    }
    
    /**
     * Creates an array of random ints of specified length.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  array of random ints
     */
    public int[] createRandInts(int numberOfItems, int seed) {
        Random random = new Random(seed);
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = random.nextInt(201);
        }
        return intArray;
    }
    
    /**
     * Creates an array of reverse sorted ints of specified length.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @return  array of reverse sorted ints
     */
    public int[] createWorstInts(int numberOfItems) {
        int [] intArray = new int [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            intArray[i] = numberOfItems - i - 1;
        }
        return intArray;
    }
    
    /**
     * Creates an array of random Strings of specified length.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  array of random Strings
     */
    public String[] createRandStrings(int numberOfItems, int seed) {
        Random random = new Random(seed);
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            int idx = random.nextInt(sortedStrings.length);
            stringArray[i] = sortedStrings[idx];
        }
        return stringArray;
    }
    
    /**
     * Creates an array of sorted Strings of specified length.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @return  array of sorted Strings
     */
    public String[] createSortedStrings(int numberOfItems) {
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) stringArray[i]=sortedStrings[0];
            else if (i < (numberOfItems*(2/10))) stringArray[i]=sortedStrings[1];
            else if (i < (numberOfItems*(3/10))) stringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(4/10))) stringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(5/10))) stringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(6/10))) stringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(7/10))) stringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(8/10))) stringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(9/10))) stringArray[i]=sortedStrings[8];
            else stringArray[i]=sortedStrings[9];
        }
        return stringArray;
    }
    
    /**
     * Creates an array of reverse sorted Strings of specified length.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @return  array of reverse sorted Strings
     */
    public String[] createWorstStrings(int numberOfItems) {
        String [] stringArray = new String [numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) stringArray[i]=sortedStrings[9];
            else if (i < (numberOfItems*(2/10))) stringArray[i]=sortedStrings[8];
            else if (i < (numberOfItems*(3/10))) stringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(4/10))) stringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(5/10))) stringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(6/10))) stringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(7/10))) stringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(8/10))) stringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(9/10))) stringArray[i]=sortedStrings[1];
            else stringArray[i]=sortedStrings[0];
        }
        return stringArray;
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
        int [] intArray = createRandInts(numberOfItems, seed);
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
        int [] intArray = createSortedInts(numberOfItems);
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
        int [] intArray = createWorstInts(numberOfItems);
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
        String[] stringArray = createRandStrings(numberOfItems, seed);
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
        String[] stringArray = createSortedStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        bubbleString.sort(stringArray);
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
        String[] stringArray = createWorstStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        bubbleString.sort(stringArray);
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
        int [] intArray = createRandInts(numberOfItems, seed);
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
        int [] intArray = createSortedInts(numberOfItems);
        long startTime = System.currentTimeMillis();
        insertionInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        /*
        String output = new String();
        for(int i = 0; i < intArray.length; i++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println(output);
        System.out.println(runTime); */
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
        int [] intArray = createWorstInts(numberOfItems);
        /*
        String output1 = new String();
        for(int i = 0; i < intArray.length; i++) {
            output1 = output1 + "" + intArray[i] + ",";
        }
        System.out.println(output1); */
        long startTime = System.currentTimeMillis();
        insertionInt.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        /*
        String output = new String();
        for(int i = 0; i < intArray.length; i++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println(output); */
        //System.out.println(runTime);
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
        String[] stringArray = createRandStrings(numberOfItems, seed);
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
        String[] stringArray = createSortedStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        insertionString.sort(stringArray);
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
        String[] stringArray = createWorstStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        insertionString.sort(stringArray);
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
        int [] intArray = createRandInts(numberOfItems, seed);
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
        int [] intArray = createSortedInts(numberOfItems);
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
        int [] intArray = createWorstInts(numberOfItems);
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
        String[] stringArray = createRandStrings(numberOfItems, seed);
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
        String[] stringArray = createSortedStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        quicksortFirstString.sort(stringArray);
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
        String[] stringArray = createWorstStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        quicksortFirstString.sort(stringArray);
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
        int [] intArray = createRandInts(numberOfItems, seed);
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
        int [] intArray = createSortedInts(numberOfItems);
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
        int [] intArray = createWorstInts(numberOfItems);
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
        String[] stringArray = createRandStrings(numberOfItems, seed);
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
        String[] stringArray = createSortedStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        quicksortMedianString.sort(stringArray);
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
        String[] stringArray = createWorstStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        quicksortMedianString.sort(stringArray);
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
        int [] intArray = createRandInts(numberOfItems, seed);
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
        int [] intArray = createSortedInts(numberOfItems);
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
        int [] intArray = createWorstInts(numberOfItems);
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
        String[] stringArray = createRandStrings(numberOfItems, seed);
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
        String[] stringArray = createSortedStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        quicksortRandString.sort(stringArray);
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
        String[] stringArray = createWorstStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        quicksortRandString.sort(stringArray);
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
        int [] intArray = createRandInts(numberOfItems, seed);
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
        int [] intArray = createSortedInts(numberOfItems);
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
        int [] intArray = createWorstInts(numberOfItems);
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
        String[] stringArray = createRandStrings(numberOfItems, seed);
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
        String[] stringArray = createSortedStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        mergeSortString.sort(stringArray);
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
        String[] stringArray = createWorstStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        mergeSortString.sort(stringArray);
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
        int [] intArray = createRandInts(numberOfItems, seed);
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
        int [] intArray = createSortedInts(numberOfItems);
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
        int [] intArray = createWorstInts(numberOfItems);
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
        String[] stringArray = createRandStrings(numberOfItems, seed);
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
        String[] stringArray = createSortedStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        selectionSortString.sort(stringArray);
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
        String[] stringArray = createWorstStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        selectionSortString.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    public long timeJavaQuicksortSortedInts(int numberOfItems, int seed) {
        int [] intArray = createSortedInts(numberOfItems);
        long startTime = System.currentTimeMillis();
        Arrays.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    public long timeJavaQuicksortRandInts(int numberOfItems, int seed) {
        int [] intArray = createRandInts(numberOfItems, seed);
        long startTime = System.currentTimeMillis();
        Arrays.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    public long timeJavaQuicksortWorstCaseInts(int numberOfItems, int seed) {
        int [] intArray = createWorstInts(numberOfItems);
        long startTime = System.currentTimeMillis();
        Arrays.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    ///
    
    /**
     * Creates an array list of random Strings of specified length.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  array list of random Strings
     */
    public ArrayList<String> createRandStringsArrayList(int numberOfItems, int seed) {
        Random random = new Random(seed);
        ArrayList<String> stringAL = new ArrayList<String>();
        for (int i = 0; i < numberOfItems; i++) {
            int idx = random.nextInt(sortedStrings.length);
            stringAL.add(sortedStrings[idx]);
        }
        return stringAL;
    }
    
    /**
     * Creates an array of sorted Strings of specified length.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @return  array of sorted Strings
     */
    public ArrayList<String> createSortedStringsArrayList(int numberOfItems) {
        ArrayList<String> stringAL = new ArrayList<String>();
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) stringAL.add(sortedStrings[0]);
            else if (i < (numberOfItems*(2/10))) stringAL.add(sortedStrings[1]);
            else if (i < (numberOfItems*(3/10))) stringAL.add(sortedStrings[2]);
            else if (i < (numberOfItems*(4/10))) stringAL.add(sortedStrings[3]);
            else if (i < (numberOfItems*(5/10))) stringAL.add(sortedStrings[4]);
            else if (i < (numberOfItems*(6/10))) stringAL.add(sortedStrings[5]);
            else if (i < (numberOfItems*(7/10))) stringAL.add(sortedStrings[6]);
            else if (i < (numberOfItems*(8/10))) stringAL.add(sortedStrings[7]);
            else if (i < (numberOfItems*(9/10))) stringAL.add(sortedStrings[8]);
            else stringAL.add(sortedStrings[9]);
        }
        return stringAL;
    }
    
    /**
     * Creates an array of reverse sorted Strings of specified length.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @return  array of reverse sorted Strings
     */
    public ArrayList<String> createWorstStringsArrayList(int numberOfItems) {
        ArrayList<String> stringAL = new ArrayList<String>();
        for (int i = 0; i < numberOfItems; i++) {
            if (i < (numberOfItems/10)) stringAL.add(sortedStrings[9]);
            else if (i < (numberOfItems*(2/10))) stringAL.add(sortedStrings[8]);
            else if (i < (numberOfItems*(3/10))) stringAL.add(sortedStrings[7]);
            else if (i < (numberOfItems*(4/10))) stringAL.add(sortedStrings[6]);
            else if (i < (numberOfItems*(5/10))) stringAL.add(sortedStrings[5]);
            else if (i < (numberOfItems*(6/10))) stringAL.add(sortedStrings[4]);
            else if (i < (numberOfItems*(7/10))) stringAL.add(sortedStrings[3]);
            else if (i < (numberOfItems*(8/10))) stringAL.add(sortedStrings[2]);
            else if (i < (numberOfItems*(9/10))) stringAL.add(sortedStrings[1]);
            else stringAL.add(sortedStrings[0]);
        }
        return stringAL;
    }
    
    public long timeJavaMergesortSortedStrings(int numberOfItems, int seed) {
        ArrayList<String> stringAL = createSortedStringsArrayList(numberOfItems);
        long startTime = System.currentTimeMillis();
        Collections.sort(stringAL);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    public long timeJavaMergesortRandStrings(int numberOfItems, int seed) {
        ArrayList<String> stringAL = createRandStringsArrayList(numberOfItems, seed);
        long startTime = System.currentTimeMillis();
        Collections.sort(stringAL);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    public long timeJavaMergesortWorstCaseStrings(int numberOfItems, int seed) {
        ArrayList<String> stringAL = createWorstStringsArrayList(numberOfItems);
        long startTime = System.currentTimeMillis();
        Collections.sort(stringAL);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
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
        int [] numberOfItemsLong = {1000, 2500, 5000, 7500, 10000};//, 10000, 15000, 25000};
        int [] numberOfItemsMedium = {1000, 10000, 25000, 50000, 75000, 100000};
        int [] numberOfItemsFast = {1000, 2500, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000};
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
            output.close(); // closes the FileWriter
        } catch (Exception e){ //handles necessary exceptions
            System.out.println("Exception occured " + e);
        }
    }
}
