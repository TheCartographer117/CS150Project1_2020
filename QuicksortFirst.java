import java.util.*;
/**
 * An implement of Quicksort using the first element as the pivot
 *
 * @author Benjamin Gersten and Taylor Strong
 * @version Oct 10, 2020
 */
public class QuicksortFirst extends Quicksort {
    /**
     * Determines the pivot value which is the first element of the subarray
     * 
     * @param   a       an array of ints.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  the pivot
     */
    public int findPivot(int[] a, int fst, int lst) {
        int pivot = a[fst];
        return pivot;
    }
    
    /**
     * Determines the pivot value which is the first element of the subarray
     * 
     * @param   a       an array of comparable items.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  the pivot
     */
    public <T extends Comparable<? super T>> T findPivot(T[] a, int fst, int lst) {
        T pivot = a[fst];
        return pivot;
    }
    
    /**
     * Determines the pivot value which is the first element of the subarray. Uses a comparator object.
     * 
     * @param   a       an array of objects.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @param   c       a comparator object
     * @return  the pivot
     */
    public <T> T findPivot (T[] a, int fst, int lst, Comparator<T> c) {
        T pivot = a[fst];
        return pivot;
    }
    
    /**
     * Return the method of sorting. 
     *
     * @return the method of sorting
     */ 
    public String toString() {
        return "First Pivot Quicksort";
    }
}