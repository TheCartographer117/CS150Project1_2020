import java.util.*;
/**
 * Write a description of class QuicksortFirst here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuicksortFirst extends Quicksort {
    
    public int partition (int[] a, int fst, int lst) {
        int pivot = a[fst];
        int u = fst;
        int d = lst;
        do { 
            while ((u < lst) && (pivot >= a[u]))
                u++; 
            while (pivot < a[d]) 
                d--; 
            if (u < d) 
                swap(a, u, d);
        } while (u < d);
        swap(a, fst, d);
        return d; 
    }
    
    
    public <T extends Comparable<? super T>> int partition (T[] a, int fst, int lst) {
        T pivot = a[fst];
        int u = fst;
        int d = lst;
        do { 
            while ((u < lst) && (pivot.compareTo(a[u]) >= 0)) 
                u++; 
            while (pivot.compareTo(a[d]) < 0) 
                d--; 
            if (u < d) 
                swap(a, u, d); 
        } while (u < d);
        swap(a, fst, d);
        return d; 
    }
    
    public <T> int partition (T[] a, int fst, int lst, Comparator<T> c) {
        T pivot = a[fst];
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
}
