import java.util.*;
/**
 * An implement of Quicksort using a random pivot
 *
 * @author Benjamin Gersten and Taylor Strong
 * @version Oct 10, 2020
 */
public class QuicksortRand extends Quicksort {
    int seed;
    Random random;
    
    /**
     * A constructor for this sorting algorithm's class. Configures the randomness of the random pivot value
     * 
     * @param   seed    initial value of the internal state of the pseudorandom number generator
     */
    public QuicksortRand(int seed) {
        this.seed = seed;
        random = new Random(seed);
    }
    
    /**
     * Determines the pivot value which is a random element in the array, bounded by fst and lst.
     * 
     * @param   a       an array of ints.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  the pivot
     */
    public int findPivot(int[] a, int fst, int lst) {
        int pivotIndex = fst + random.nextInt(lst - fst + 1);
        swap(a, pivotIndex, fst);
        int pivot = a[fst];
        return pivot;
    }
    
    /**
     * Determines the pivot value which is a random element in the array, bounded by fst and lst.
     * 
     * @param   a       an array of comparable items.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @return  the pivot
     */
    public <T extends Comparable<? super T>> T findPivot(T[] a, int fst, int lst) {
        int pivotIndex = fst + random.nextInt(lst - fst + 1);
        swap(a, pivotIndex, fst);
        T pivot = a[fst];
        return pivot;
    }
    
    /**
     * Determines the pivot value which is a random element in the array, bounded by fst and lst.
     * Uses a comparator object.
     * 
     * @param   a       an array of objects.
     * @param   fst     first element of the subarray
     * @param   lst     last element of the subarray
     * @param   c       a comparator object
     * @return  the pivot
     */
    public <T> T findPivot (T[] a, int fst, int lst, Comparator<T> c) {
        int pivotIndex = fst + random.nextInt(lst - fst + 1);
        swap(a, pivotIndex, fst);
        T pivot = a[fst];
        return pivot;
    }
    
    /**
     * Return the method of sorting. 
     *
     * @return the method of sorting
     */ 
    public String toString() {
        return "Random Pivot Quicksort";
    }
}