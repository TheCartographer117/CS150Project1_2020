import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SelectionSortTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SelectionSortTest
{
    /**
     * Default constructor for test class SelectionSortTest
     */
    public SelectionSortTest()
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
    public void testSelectionIntsRand()
    {
        SelectionSort selectionSo1 = new SelectionSort();
        int [] intArray = {3,5,2,4,1};
        selectionSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("selectionIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testSelectionIntsSorted()
    {
        SelectionSort selectionSo1 = new SelectionSort();
        int [] intArray = {1,2,3,4,5};
        selectionSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("selectionIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testSelectionIntsWorst()
    {
        SelectionSort selectionSo1 = new SelectionSort();
        int [] intArray = {5,4,3,2,1};
        selectionSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("selectionIntsWorst: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testSelectionStringsRand()
    {
        SelectionSort selectionSo1 = new SelectionSort();
        String [] intArray = {"ac","ad","aa","ab","ae"};
        selectionSo1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("selectionIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testSelectionStringsSorted()
    {
        SelectionSort selectionSo1 = new SelectionSort();
        String [] intArray = {"aa","ab","ac","ad","ae"};
        selectionSo1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("selectionIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testSelectionStringsWorst()
    {
        SelectionSort selectionSo1 = new SelectionSort();
        String [] intArray = {"ae","ad","ac","ab","aa"};
        selectionSo1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("selectionIntsWorst: " + output);
        assertEquals(solution, output);
    }
}
