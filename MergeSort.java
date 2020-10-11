import java.util.*;
/**
 * An Implement of MergeSort
 *
 * @author Benjamin Gersten and Taylor Strong
 * @version Oct 10, 2020
 */
public class MergeSort implements Sorter {
    /**
     * Sort an array of ints using merge sort. Overides interface method
     *
     * @param   a   an array of ints
     */
    public void sort (int[] a) {
        sort(a, 0, a.length - 1);
    }
    
    /**
     * Sort an array of ints using merge sort. 
     *
     * @param   a   an array of ints
     * @param   start   the start of the array being sorted
     * @param   end the end of the array being sorted
     */
    public void sort (int[] a, int start, int end) { 
        if (start >= end) return; // terminates loop if subarray is of length 1

        int half = (start+end) / 2; 
        sort(a, start, half); //split array into two halves and sort each half recursively
        sort(a, half+1, end);

        merge(a, start, half, end); //merge the two sorted halves
    }

    /**
     * Called by int sort to merge sorted components
     * 
     * @param   a           an array of comparable objects
     * @param   start       the start of the array being sorted
     * @param   half        the midpoint of the array being sorted
     * @param   end         the end of the array being sorted
     */
    private void merge(int[] a, int start, int half, int end) { 
        int[] b = Arrays.copyOfRange(a, start, half+1); // requires more space
        int i = 0; //index in b
        int j = half+1; // index in second half of a 
        int k = start; // index in merged a
        while (i < b.length && j <= end ) 
            if (b[i] <= a[j])
                a[k++] = b[i++]; 
            else
                a[k++] = a[j++];
        while (i < b.length) a[k++] = b[i++]; // copies remaining elements of array if they exist
    } 
    
    /**
     * Sort an array of comparable objects using merge sort. Overides interface method.
     *
     * @param   a   an array of ints
     */
    public <T extends Comparable<? super T>> void sort (T[] a) {
        sort(a, 0, a.length - 1);
    }
    
    /**
     * Sort an array of comparable objects using merge sort. 
     *
     * @param   a   an array of comparable objects
     * @param   start   the start of the array being sorted
     * @param   end the end of the array being sorted
     */
    public static <T extends Comparable<? super T>> void sort (T[] a, int start, int end) { 
        if (start >= end) return; // terminates loop if subarray is of length 1

        int half = (start+end) / 2;
        sort(a, start, half); //split array into two halves and sort each half recursively
        sort(a, half+1, end);

        merge(a, start, half, end); //merge the two sorted halves
    }

    /**
     * Called by sort to merge sorted components (comparable objects)
     * 
     * @param   a           an array of comparable objects
     * @param   start       the start of the array being sorted
     * @param   half        the midpoint of the array being sorted
     * @param   end         the end of the array being sorted
     */
    private static <T extends Comparable<? super T>> void merge(T[] a, int start, int half, int end) { 
        T[] b = Arrays.copyOfRange(a, start, half+1); // requires more space
        int i = 0; //index in b
        int j = half+1; // index in second half of a 
        int k = start; // index in merged a
        while (i < b.length && j <= end ) 
            if (b[i].compareTo(a[j]) <= 0)
                a[k++] = b[i++]; 
            else
                a[k++] = a[j++];
        while (i < b.length) a[k++] = b[i++]; // copies remaining elements of array if they exist
    }
    
    /**
     * Sort an array of comparable objects using merge sort. Overides interface method.
     *
     * @param   a   an array of ints
     * @param  c  a comparator object
     */
    public <T> void sort (T[] a, Comparator<T> c) {
        sort(a, 0, a.length - 1, c);
    }
    
    /**
     * Sort an array of comparable objects using merge sort. 
     *
     * @param   a   an array of comparable objects
     * @param   start   the start of the array being sorted
     * @param   end the end of the array being sorted
     * @param   c    a comparator object
     */
    public <T> void sort (T[] a, int start, int end, Comparator<T> c) { 
        if (start >= end) return; // terminates loop if subarray is of length 1

        int half = (start+end) / 2;
        sort(a, start, half, c); //split array into two halves and sort each half recursively
        sort(a, half+1, end, c);

        merge(a, start, half, end, c); //merge the two sorted halves
    }

    /**
     * Called by sort to merge sorted components (comparable objects)
     * 
     * @param   a           an array of comparable objects
     * @param   start       the start of the array being sorted
     * @param   half        the midpoint of the array being sorted
     * @param   end         the end of the array being sorted
     * @param   c           a comparator object
     */
    private <T> void merge(T[] a, int start, int half, int end, Comparator<T> c) { 
        T[] b = Arrays.copyOfRange(a, start, half+1); // requires more space
        int i = 0; //index in b
        int j = half+1; // index in second half of a 
        int k = start; // index in merged a
        while (i < b.length && j <= end ) 
            if (c.compare(b[i],a[j]) <= 0)
                a[k++] = b[i++]; 
            else
                a[k++] = a[j++];
        while (i < b.length) a[k++] = b[i++]; // copies remaining elements of array if they exist
    }
    
    /**
     * Return the method of sorting. 
     *
     * @return the method of sorting
     */ 
    public String toString() {
        return "Merge sort";
    }
}