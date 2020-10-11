import java.util.*;

/**
 * An implement of InsertionSort
 *
 * @author Benjamin Gersten and Taylor Strong
 * @version Oct 10, 2020
 */
public class InsertionSort implements Sorter {
    /**
     * Sort an array of ints using insertion sort. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a) {
        for (int nextPos = 1; nextPos < a.length; nextPos++) {
            insert(a, nextPos);
        }
    }

    /**
     * Called by the sorting method for ints
     * 
     * @param   a   an array of ints
     * @param   nextPos the next position that an element belongs to
     */
    private void insert (int[] a, int nextPos) { 
        int nextVal = a[nextPos]; 
        while (nextPos > 0 && nextVal < a[nextPos-1]){ 
            a[nextPos] = a[nextPos-1]; 
            nextPos--;
        } 
        a[nextPos] = nextVal;
    }

    /**
     * Sort an array of comparable objects using insertion sort.
     * 
     * @param   a   an array of comparable objects
     */
    public <T extends Comparable<? super T>> void sort (T[] a) { 
        for (int nextPos = 1; nextPos < a.length; nextPos++) {
            insert(a, nextPos);
        }
    }

    /**
     * Called by the sorting method for comparable objects
     * 
     * @param   a   an array of comparable objects
     * @param   nextPos the next position that an element belongs to
     */
    private <T extends Comparable<? super T>> void insert (T[] a, int nextPos) { 
        T nextVal = a[nextPos]; 
        while (nextPos > 0 && nextVal.compareTo(a[nextPos-1]) < 0){ 
            a[nextPos] = a[nextPos-1]; 
            nextPos--;
        } 
        a[nextPos] = nextVal;
    }

    /**
     * Sort an array of objects using insertion sort. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T> void sort (T[] a, Comparator<T> c) {
        for (int nextPos = 1; nextPos < a.length; nextPos++) {
            insert(a, nextPos, c);
        }
    }

    /**
     * Sort an array of objects using insertion sort. 
     *
     * @param  a  an array of objects
     * @param   nextPos the next position that an element belongs to
     * @param  c  a comparator object
     */
    private static <T> void insert (T[] a, int nextPos, Comparator<T> c) { 
        T nextVal = a[nextPos]; 
        while (nextPos > 0 && c.compare(a[nextPos-1], a[nextPos]) < 0){ 
            a[nextPos] = a[nextPos-1]; 
            nextPos--;
        } 
        a[nextPos] = nextVal;
    }

    /**
     * Return the method of sorting. 
     *
     * @return the method of sorting
     */ 
    public String toString() {
        return "Insertion sort";
    }
}