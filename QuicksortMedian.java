import java.util.*;
/**
 * Write a description of class QuicksortMedian here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuicksortMedian extends Quicksort
{
    public int partition (int[] a, int fst, int lst) {
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

        //Place pivot at position high - 1
        swap(a, middle, lst - 1);
        int pivot = a[lst - 1];

        int i;
        int j;
        for (i = fst, j = lst - 1; ; ) {
            while (a[++i] < pivot);
            while(pivot < a[--j]);
            if (i >= j) {
                break;
            }
            swap(a, i , j);
        }

        swap(a, i , lst - 1);
        return i;
        /*
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
        return d; */
    }

    public <T extends Comparable<? super T>> int partition (T[] a, int fst, int lst) {
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

        //Place pivot at position high - 1
        swap(a, middle, lst - 1);
        T pivot = a[lst - 1];

        int i;
        int j;
        for (i = fst, j = lst - 1; ; ) {
            while (a[++i].compareTo(pivot) < 0);
            while(pivot.compareTo(a[--j]) < 0);
            if (i >= j) {
                break;
            }
            swap(a, i , j);
        }

        swap(a, i , lst - 1); //Restore pivot
        return i;
        /*
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
        return d; */
    }

    public <T> int partition (T[] a, int fst, int lst, Comparator<T> c) {
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

        //Place pivot at position high - 1
        swap(a, middle, lst - 1);
        T pivot = a[lst - 1];
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
