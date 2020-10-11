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
            if (i < (numberOfItems/10.)) stringArray[i]=sortedStrings[0];
            else if (i < (numberOfItems*(2./10.))) stringArray[i]=sortedStrings[1];
            else if (i < (numberOfItems*(3./10.))) stringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(4./10.))) stringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(5./10.))) stringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(6./10.))) stringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(7./10.))) stringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(8./10.))) stringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(9./10.))) stringArray[i]=sortedStrings[8];
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
            if (i < (numberOfItems/10.)) stringArray[i]=sortedStrings[9];
            else if (i < (numberOfItems*(2./10.))) stringArray[i]=sortedStrings[8];
            else if (i < (numberOfItems*(3./10.))) stringArray[i]=sortedStrings[7];
            else if (i < (numberOfItems*(4./10.))) stringArray[i]=sortedStrings[6];
            else if (i < (numberOfItems*(5./10.))) stringArray[i]=sortedStrings[5];
            else if (i < (numberOfItems*(6./10.))) stringArray[i]=sortedStrings[4];
            else if (i < (numberOfItems*(7./10.))) stringArray[i]=sortedStrings[3];
            else if (i < (numberOfItems*(8./10.))) stringArray[i]=sortedStrings[2];
            else if (i < (numberOfItems*(9./10.))) stringArray[i]=sortedStrings[1];
            else stringArray[i]=sortedStrings[0];
        }
        return stringArray;
    }
    
    /**
     * Returns the amount of time to sort an array of random ints using a specified sorthing algorithm
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @param   method          the algorithm used to sort
     * @return  length of time to sort all items
     */
    public long timeSortRandInts(int numberOfItems, int seed, Sorter method) {
        Sorter s = method;
        int [] intArray = createRandInts(numberOfItems, seed);
        long startTime = System.currentTimeMillis();
        s.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        //printArray(intArray);
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted ints using a specified sorthing algorithm
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @param   method          the algorithm used to sort
     * @return  length of time to sort all items
     */
    public long timeSortSortedInts(int numberOfItems, int seed, Sorter method) {
        Sorter s = method;
        int [] intArray = createSortedInts(numberOfItems);
        long startTime = System.currentTimeMillis();
        s.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        //printArray(intArray);
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted ints using a specified sorthing algorithm
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @param   method          the algorithm used to sort
     * @return  length of time to sort all items
     */
    public long timeSortWorstCaseInts(int numberOfItems, int seed, Sorter method) {
        Sorter s = method;
        int [] intArray = createWorstInts(numberOfItems);
        long startTime = System.currentTimeMillis();
        s.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        //printArray(intArray);
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random Strings using a specified sorthing algorithm
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @param   method          the algorithm used to sort
     * @return  length of time to sort all items
     */
    public long timeSortRandStrings(int numberOfItems, int seed, Sorter method) {
        Sorter s = method;
        String[] stringArray = createRandStrings(numberOfItems, seed);
        long startTime = System.currentTimeMillis();
        s.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        //printArray(stringArray);
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of sorted Strings using a specified sorthing algorithm
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @param   method          the algorithm used to sort
     * @return  length of time to sort all items
     */
    public long timeSortSortedStrings(int numberOfItems, int seed, Sorter method) {
        Sorter s = method;
        String[] stringArray = createSortedStrings(numberOfItems);
        long startTime = System.currentTimeMillis();
        s.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        //printArray(stringArray);
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted Strings using a specified sorthing algorithm
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @param   method          the algorithm used to sort
     * @return  length of time to sort all items
     */
    public long timeSortWorstCaseStrings(int numberOfItems, int seed, Sorter method) {
        Sorter s = method;
        int [] stringArray = createWorstInts(numberOfItems);
        long startTime = System.currentTimeMillis();
        s.sort(stringArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        //printArray(stringArray);
        return runTime;
    }
    
    // Arrays Quicksort

    /**
     * Returns the amount of time to sort an array of sorted ints using a Java Arrays.sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to sort all items
     */
    public long timeJavaQuicksortSortedInts(int numberOfItems, int seed) {
        int [] intArray = createSortedInts(numberOfItems);
        long startTime = System.currentTimeMillis();
        Arrays.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of random ints using a Java Arrays.sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to sort all items
     */
    public long timeJavaQuicksortRandInts(int numberOfItems, int seed) {
        int [] intArray = createRandInts(numberOfItems, seed);
        long startTime = System.currentTimeMillis();
        Arrays.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an array of reverse sorted ints using a Java Arrays.sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to sort all items
     */
    public long timeJavaQuicksortWorstCaseInts(int numberOfItems, int seed) {
        int [] intArray = createWorstInts(numberOfItems);
        long startTime = System.currentTimeMillis();
        Arrays.sort(intArray);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /// Collections Mergesort
    
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
    
    /**
     * Returns the amount of time to sort an ArrayList of sorted Strings using a Java Collections.sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to sort all items
     */
    public long timeJavaMergesortSortedStrings(int numberOfItems, int seed) {
        ArrayList<String> stringAL = createSortedStringsArrayList(numberOfItems);
        long startTime = System.currentTimeMillis();
        Collections.sort(stringAL);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an ArrayList of random Strings using a Java Collections.sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to sort all items
     */
    public long timeJavaMergesortRandStrings(int numberOfItems, int seed) {
        ArrayList<String> stringAL = createRandStringsArrayList(numberOfItems, seed);
        long startTime = System.currentTimeMillis();
        Collections.sort(stringAL);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    /**
     * Returns the amount of time to sort an ArrayList of reverse sorted Strings using a Java Collections.sort.
     * The randomness is controlled by the seed.
     *
     * @param   numberOfItems   the number of items to insert into the array
     * @param   seed            initial value of the internal state of the pseudorandom number generator
     * @return  length of time to sort all items
     */
    public long timeJavaMergesortWorstCaseStrings(int numberOfItems, int seed) {
        ArrayList<String> stringAL = createWorstStringsArrayList(numberOfItems);
        long startTime = System.currentTimeMillis();
        Collections.sort(stringAL);
        long stopTime = System.currentTimeMillis();
        long runTime = stopTime - startTime;
        return runTime;
    }
    
    // Misc
    
    /**
     * Prints a generic array to the terminal with each index separated by a comma.
     * 
     * @param   a   the array being printed
     */
    public <T> void printArray(T[] a) {
        String output = new String();
        for(int i = 0; i < a.length; i++) {
            output = output + "" + a[i] + ",";
        }
        System.out.println(output);
    }
    
    /**
     * Prints an int array to the terminal with each index separated by a comma.
     * 
     * @param   a   the array being printed
     */
    public void printArray(int[] a) {
        String output = new String();
        for(int i = 0; i < a.length; i++) {
            output = output + "" + a[i] + ",";
        }
        System.out.println(output);
    }
}
