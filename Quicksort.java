import java.util.*;
/**
 * An implement of Quicksort as an abstract class. The concrete subclasses define different ways to select
 * a pivot. This class contains the bulk of the architecture that is responsible for the quicksort algorithm,
 * including partitioning and an internal insertion sort routine for subarrays.
 *
 * @author Benjamin Gersten
 * @version Oct 10, 2020
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

    /**
     * Sort an array of ints using quicksort. Involves recursion. Uses an internal insertion sort routine for
     * small subarrays
     *
     * @param   a   an array of ints
     * @param   fst first element of the subarray
     * @param   lst last element of the subarray
     */
    private void qSort (int[] a, int fst, int lst) {
        if (fst + 2 > lst) { //Use a cutoff to handle small subarrays
            insertionSort(a, fst, lst);
        } else {
            int pivot = findPivot(a, fst, lst); // find the pivot value
            int pivIndex = partition(a, pivot, fst, lst); // partition the array around the pivot
            qSort(a, fst, pivIndex-1); //recursive calls
            qSort(a, pivIndex+1, lst); 
        }
    }

    /**
     * Internal insertion sort routine for subarrays that is used by quicksort.
     * 
     * @param   a       an array of Comparable items.
     * @param   low     the left-most index of the subarray.
     * @param   high    the number of items to sort.
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

    /**
     * Partition method called by qSort. Places elements elements larger than the pivot to the right and all
     * elements smaller to the left.
     * 
     * @param   a       an array of ints.
     * @param   pivot   the element being pivoted around
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  returns the index of the pivot after placing it correctly in the array
     */
    private int partition (int[] a, int pivot, int fst, int lst) {
        int u = fst;
        int d = lst;
        do { 
            while ((u < lst) && (pivot >= a[u]))
                u++; 
            while (pivot < a[d] && (d > fst)) 
                d--; 
            if (u < d) 
                swap(a, u, d);
        } while (u < d);
        swap(a, fst, d);
        return d;
    }

    /**
     * Determines the pivot value depending on the type of quicksort being implemented. For ints.
     * 
     * @param   a       an array of ints.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  the pivot
     */
    abstract int findPivot(int[] a, int fst, int lst);

    ////

    /**
     * Sort an array of comparable objects using Quicksort. Overides interface method
     *
     * @param   a   an array of comparable objects
     */
    public <T extends Comparable<? super T>> void sort (T[] a) {
        qSort(a, 0, a.length-1); 
    } 

    /**
     * Sort an array of comparable objects using quicksort. Involves recursion. Uses an internal insertion sort 
     * routine for small subarrays.
     *
     * @param   a   an array of comparable objects
     * @param   fst first element of the subarray
     * @param   lst last element of the subarray
     */
    private <T extends Comparable<? super T>> void qSort (T[] a, int fst, int lst) { 
        if (fst + 2 > lst) {
            insertionSort(a, fst, lst);
        } else {
            T pivot = findPivot(a, fst, lst);
            int pivIndex = partition(a, pivot, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst); 
        }
    }

    /**
     * Partition method called by qSort. Places elements elements larger than the pivot to the right and all
     * elements smaller to the left.
     * 
     * @param   a       an array of comparable items.
     * @param   pivot   the element being pivoted around
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  returns the index of the pivot after placing it correctly in the array
     */
    private <T extends Comparable<? super T>> int partition (T[] a, T pivot, int fst, int lst) {
        int u = fst;
        int d = lst;
        do { 
            while ((u < lst) && (pivot.compareTo(a[u]) >= 0)) 
                u++; 
            while (pivot.compareTo(a[d]) < 0 && (d > fst)) 
                d--; 
            if (u < d) 
                swap(a, u, d); 
        } while (u < d);
        swap(a, fst, d);
        return d; 
    }

    /**
     * Determines the pivot value depending on the type of quicksort being implemented. For comparable items.
     * 
     * @param   a       an array of comparable items.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  the pivot
     */
    abstract <T extends Comparable<? super T>> T findPivot(T[] a, int fst, int lst);

    /**
     * Internal insertion sort routine for subarrays that is used by quicksort.
     * 
     * @param   a       an array of Comparable items.
     * @param   low     the left-most index of the subarray.
     * @param   high    the number of items to sort.
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

    /**
     * Sort an array of objects using quicksort and a comparator. Involves recursion. Uses an internal insertion 
     * routine for small subarrays.
     *
     * @param   a   an array of comparable objects
     * @param   fst first element of the subarray
     * @param   lst last element of the subarray
     * @param   c   a comparator object
     */
    private <T> void qSort (T[] a, int fst, int lst, Comparator<T> c) { 
        if (fst + 2 > lst) {
            insertionSort(a, fst, lst, c);
        } else {
            T pivot = findPivot(a, fst, lst, c);
            int pivIndex = partition(a, pivot, fst, lst, c);
            qSort(a, fst, pivIndex-1, c);
            qSort(a, pivIndex+1, lst, c); 
        }
    }

    /**
     * Partition method called by qSort. Places elements elements larger than the pivot to the right and all
     * elements smaller to the left.
     * 
     * @param   a       an array of objects.
     * @param   pivot   the element being pivoted around
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @param   c   a comparator object
     * @return  returns the index of the pivot after placing it correctly in the array
     */
    private <T> int partition (T[] a, T pivot, int fst, int lst, Comparator<T> c) {
        int u = fst;
        int d = lst;
        do { 
            while ((u < lst) && (c.compare(pivot, a[u]) >= 0))
                u++; 
            while (c.compare(pivot, a[u]) < 0)
                d--; 
            if (u < d) 
                swap(a, u, d); 
        } while (u < d);
        swap(a, fst, d);
        return d;    
    }

    /**
     * Determines the pivot value depending on the type of quicksort being implemented. For objects, uses a
     * comparator object.
     * 
     * @param   a       an array of objects.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @param   c       a comparator object
     * @return  the pivot
     */
    abstract <T> T findPivot (T[] a, int fst, int lst, Comparator<T> c);
    
    /**
     * Internal insertion sort routine for subarrays that is used by quicksort.
     * 
     * @param   a       an array of Comparable items.
     * @param   low     the left-most index of the subarray.
     * @param   high    the number of items to sort.
     * @param   c       a comparator object
     */
    private static <T> void insertionSort(T[] a, int low, int high, Comparator<T> c) {
        for( int p = low + 1; p <= high; p++ ) {
            T tmp = a[p];
            int j;

            for(j = p; j > low && c.compare(tmp, a[j-1]) < 0; j-- ) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

    ////

    /**
     * Method to swap to elements in an array.
     * 
     * @param   a     an array of ints.
     * @param   idx1  the index of the first object.
     * @param   idx2  the index of the second object.
     */
    public static final void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    // Citation in notes
    // https://users.cs.fiu.edu/~weiss/dsj3/code/Sort.java

    /**
     * Method to swap to elements in an array.
     * 
     * @param   a     an array of objects.
     * @param   idx1  the index of the first object.
     * @param   idx2  the index of the second object.
     */
    public static final <T> void swap(T[] a, int idx1, int idx2) {
        T tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    // Citation in notes
    // https://users.cs.fiu.edu/~weiss/dsj3/code/Sort.java
}
