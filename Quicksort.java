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
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst); 
        }
    }
    
    abstract int partition (int[] a, int fst, int lst);
    
    ////
    
    public <T extends Comparable<? super T>> void sort (T[] a) {
        qSort(a, 0, a.length-1); 
    } 

    private <T extends Comparable<? super T>> void qSort (T[] a, int fst, int lst) { 
        if (fst < lst) {
            int pivIndex = partition(a, fst, lst);
            qSort(a, fst, pivIndex-1);
            qSort(a, pivIndex+1, lst); 
        }
    }

    abstract <T extends Comparable<? super T>> int partition (T[] a, int fst, int lst);
    
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
