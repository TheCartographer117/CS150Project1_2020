import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MergeSortTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MergeSortTest
{
    /**
     * Default constructor for test class MergeSortTest
     */
    public MergeSortTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testMergeIntsRand()
    {
        MergeSort mergeSo1 = new MergeSort();
        int [] intArray = {3,5,2,4,1};
        mergeSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("mergeIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testMergeIntsSorted()
    {
        MergeSort mergeSo1 = new MergeSort();
        int [] intArray = {1,2,3,4,5};
        mergeSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("mergeIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testMergeIntsWorst()
    {
        MergeSort mergeSo1 = new MergeSort();
        int [] intArray = {5,4,3,2,1};
        mergeSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("mergeIntsWorst: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testMergeStringsRand()
    {
        MergeSort mergeSo1 = new MergeSort();
        String [] intArray = {"ac","ad","aa","ab","ae"};
        mergeSo1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("mergeIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testMergeStringsSorted()
    {
        MergeSort mergeSo1 = new MergeSort();
        String [] intArray = {"aa","ab","ac","ad","ae"};
        mergeSo1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("mergeIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testMergeStringsWorst()
    {
        MergeSort mergeSo1 = new MergeSort();
        String [] intArray = {"ae","ad","ac","ab","aa"};
        mergeSo1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("mergeIntsWorst: " + output);
        assertEquals(solution, output);
    }
}
