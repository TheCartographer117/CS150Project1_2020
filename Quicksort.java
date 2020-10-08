import java.util.*;
/**
 * Write a description of class Quicksort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Quicksort implements Sorter {
    
    /**
     * Sort an array of ints using quick sort. Overides interface method
     *
     * @param   a   an array of ints
     */
    public void sort (int[] a) {
        qSort(a, 0, a.length - 1);
    }
    
    
    private void qSort (int[] a, int fst, int lst) {
        ///*
        if (fst + 2 > lst) {
            insertionSort(a, fst, lst);
        } else {
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst); 
        }
        //*/
        /*
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst); 
        } */
    }
    
    /**
     * Internal insertion sort routine for subarrays that is used by quicksort.
     * 
     * @param   a   an array of Comparable items.
     * @param   low the left-most index of the subarray.
     * @param   n   the number of items to sort.
     */
    private static void insertionSort(int[] a, int low, int high ) {
        for( int p = low + 1; p <= high; p++ ) {
            int tmp = a[p];
            int j;

            for(j = p; j > low && tmp < a[j-1]; j-- ) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }
    
    abstract int partition (int[] a, int fst, int lst);
    
    ////
    
    public <T extends Comparable<? super T>> void sort (T[] a) {
        qSort(a, 0, a.length-1); 
    } 

    private <T extends Comparable<? super T>> void qSort (T[] a, int fst, int lst) { 
        if (fst + 2 > lst) {
            insertionSort(a, fst, lst);
        } else {
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst); 
        }
        /*
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst); 
        } */
    }

    abstract <T extends Comparable<? super T>> int partition (T[] a, int fst, int lst);
    
    /**
     * Internal insertion sort routine for subarrays that is used by quicksort.
     * 
     * @param   a   an array of Comparable items.
     * @param   low the left-most index of the subarray.
     * @param   n   the number of items to sort.
     */
    private static <T extends Comparable> void insertionSort(T[] a, int low, int high ) {
        for( int p = low + 1; p <= high; p++ ) {
            T tmp = a[p];
            int j;

            for(j = p; j > low && tmp.compareTo(a[j-1]) < 0; j-- ) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }
    
    ////
    
    /**
     * Sort an array of objects using comparator. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T> void sort (T[] a, Comparator<T> c) {
        qSort(a, 0, a.length-1, c); 
    }
    
    private <T> void qSort (T[] a, int fst, int lst, Comparator<T> c) { 
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst, c);
            qSort(a, fst, pivIndex-1, c);
            qSort(a, pivIndex+1, lst, c); 
        }
    }
    
    abstract <T> int partition (T[] a, int fst, int lst, Comparator<T> c);
    
    ////
    
    /**
     * Method to swap to elements in an array.
     * 
     * @param   a       an array of objects.
     * @param   idx1  the index of the first object.
     * @param   idx2  the index of the second object.
     */
    public static final void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    // CITE THIS IN THE LAB NOTES
    // https://users.cs.fiu.edu/~weiss/dsj3/code/Sort.java
    
    /**
     * Method to swap to elements in an array.
     * 
     * @param   a       an array of objects.
     * @param   idx1  the index of the first object.
     * @param   idx2  the index of the second object.
     */
    public static final <T> void swap(T[] a, int idx1, int idx2) {
        T tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    // CITE THIS IN THE LAB NOTES
    // https://users.cs.fiu.edu/~weiss/dsj3/code/Sort.java
}
