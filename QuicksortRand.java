import java.util.*;
/**
 * Write a description of class QuicksortRand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuicksortRand extends Quicksort
{
    int seed;
    Random random;
    
    public QuicksortRand(int seed) {
        this.seed = seed;
        random = new Random(seed);
    }
    
    public int partition (int[] a, int fst, int lst) {
        int pivotIndex = random.nextInt(lst);
        swap(a, pivotIndex, fst);
        int pivot = a[fst];
        
        /*
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
        return i; //*/
        
        ///*
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
        return d; //*/
    }
    
    
    public <T extends Comparable<? super T>> int partition (T[] a, int fst, int lst) {
        //T pivot = a[random.nextInt(lst)];
        int pivotIndex = random.nextInt(lst);
        swap(a, pivotIndex, fst);
        T pivot = a[fst];
        
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
    
    public <T> int partition (T[] a, int fst, int lst, Comparator<T> c) {
        T pivot = a[random.nextInt(lst)];
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