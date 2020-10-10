import java.util.*;
/**
 * An implement of Quicksort using a median of three pivot
 *
 * @author Benjamin Gersten and Taylor Strong
 * @version Oct 10, 2020
 */
public class QuicksortMedian extends Quicksort {
    /**
     * Determines the pivot value which is the median of three from the array, bounded by fst and lst.
     * 
     * @param   a       an array of ints.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  the pivot
     */
    public int findPivot(int[] a, int fst, int lst) {
        int middle = (fst + lst)/2;
        if (a[middle] < a[fst]) {
            swap(a, fst, middle);
        }
        if (a[lst] < a[fst]) {
            swap(a, fst, lst);
        }
        if (a[lst] < a[middle]) {
            swap(a, middle, lst);
        }

        //Place pivot at position fst
        swap(a, middle, fst);//lst - 1);
        int pivot = a[fst]; //lst - 1];
        return pivot;
    }
    
    /**
     * Determines the pivot value which is the median of three from the array, bounded by fst and lst.
     * 
     * @param   a       an array of comparable items.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  the pivot
     */
    public <T extends Comparable<? super T>> T findPivot(T[] a, int fst, int lst) {
        int middle = (fst + lst)/2;
        if (a[middle].compareTo(a[fst]) < 0) {
            swap(a, fst, middle);
        }
        if (a[lst].compareTo(a[fst]) < 0) {
            swap(a, fst, lst);
        }
        if (a[lst].compareTo(a[middle]) < 0) {
            swap(a, middle, lst);
        }

        //Place pivot at position fst
        swap(a, middle, fst);//lst - 1);
        T pivot = a[fst];//lst - 1];
        return pivot;
    }
    
    /**
     * Determines the pivot value which is the median of three from the array, bounded by fst and lst.
     * Uses a comparator object.
     * 
     * @param   a       an array of objects.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @param   c       a comparator object
     * @return  the pivot
     */
    public <T> T findPivot (T[] a, int fst, int lst, Comparator<T> c) {
        int middle = (fst + lst)/2;
        if (c.compare(a[middle], a[fst]) < 0) {
            swap(a, fst, middle);
        }
        if (c.compare(a[lst], a[fst]) < 0) {
            swap(a, fst, lst);
        }
        if (c.compare(a[lst], a[middle]) < 0) {
            swap(a, middle, lst);
        }

        //Place pivot at position fst //high - 1
        swap(a, middle, fst);//lst - 1);
        T pivot = a[fst];//lst - 1];
        return pivot;
    }
    
    /**
     * Return the method of sorting. 
     *
     * @return the method of sorting
     */ 
    public String toString() {
        return "Median of Three Pivot Quicksort";
    }
}
