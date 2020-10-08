import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InsertionSortTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InsertionSortTest
{
    /**
     * Default constructor for test class InsertionSortTest
     */
    public InsertionSortTest()
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
    public void testInsertionIntsRand()
    {
        InsertionSort insertionSo1 = new InsertionSort();
        int [] intArray = {3,5,2,4,1};
        insertionSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("insertionIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testInsertionIntsSorted()
    {
        InsertionSort insertionSo1 = new InsertionSort();
        int [] intArray = {1,2,3,4,5};
        insertionSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("insertionIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testInsertionIntsWorst()
    {
        InsertionSort insertionSo1 = new InsertionSort();
        int [] intArray = {5,4,3,2,1};
        insertionSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("insertionIntsWorst: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testInsertionStringsRand()
    {
        InsertionSort insertionSo1 = new InsertionSort();
        String [] stringArray = {"ac","ad","aa","ab","ae"};
        insertionSo1.sort(stringArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < stringArray.length; i ++) {
            output = output + "" + stringArray[i] + ",";
        }
        System.out.println("insertionStringsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testInsertionStringsSorted()
    {
        InsertionSort insertionSo1 = new InsertionSort();
        String [] stringArray = {"aa","ab","ac","ad","ae"};
        insertionSo1.sort(stringArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < stringArray.length; i ++) {
            output = output + "" + stringArray[i] + ",";
        }
        System.out.println("insertionStringsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testInsertionStringsWorst()
    {
        InsertionSort insertionSo1 = new InsertionSort();
        String [] stringArray = {"ae","ad","ac","ab","aa"};
        insertionSo1.sort(stringArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < stringArray.length; i ++) {
            output = output + "" + stringArray[i] + ",";
        }
        System.out.println("insertionStringsWorst: " + output);
        assertEquals(solution, output);
    }
}
