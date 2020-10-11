import java.util.*;
/**
 * An implement of Bubble sort
 *
 * @author Benjamin Gersten and Taylor Strong
 * @version Oct 10, 2020
 */
public class BubbleSort implements Sorter {
    /**
     * Sort an array of ints using bubble sort. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a) {
        int pass = 1;
        boolean exchanges;
        do {
            exchanges = false;
            for (int i = 0; i < a.length-pass; i++) // scan unsorted portion
                if (a[i] > a[i+1]) {  // if values out of order
                    int tmp = a[i]; // exchange values
                    a[i] = a[i+1];
                    a[i+1] = tmp; 
                    exchanges = true;
                }
            pass++;
        } while (exchanges); //while the array is not sorted
    }

    /**
     * Sort an array of comparable objects using bubble sort. 
     *
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort (T[] a) {
        int pass = 1;
        boolean exchanges;
        do {
            exchanges = false;
            for (int i = 0; i < a.length-pass; i++) // scan unsorted portion
                if (a[i].compareTo(a[i+1]) > 0) { // if values out of order
                    T tmp = a[i]; // exchange values
                    a[i] = a[i+1];
                    a[i+1] = tmp; 
                    exchanges = true;
                }
            pass++;
        } while (exchanges); //while the array is not sorted
    }

    /**
     * Sort an array of objects using bubble sort. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T> void sort (T[] a, Comparator<T> c) {
        int pass = 1;
        boolean exchanges;
        do {
            exchanges = false;
            for (int i = 0; i < a.length-pass; i++)  // scan unsorted portion
                if (c.compare(a[i], a[i+1]) > 0) {  // if values out of order
                    T tmp = a[i]; // exchange values
                    a[i] = a[i+1];
                    a[i+1] = tmp; 
                    exchanges = true;
                }
            pass++;
        } while (exchanges);
    }

    /**
     * Return the method of sorting. 
     *
     * @return the method of sorting
     */ 
    public String toString() {
        return "Bubble sort";
    }
}