import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuicksortMedianTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuicksortMedianTest
{
    /**
     * Default constructor for test class QuicksortMedianTest
     */
    public QuicksortMedianTest()
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
    public void testQuickMedianIntsRand()
    {
        QuicksortMedian quickMe1 = new QuicksortMedian();
        int [] intArray = {3,5,2,4,1,7,8,6,9,10};
        quickMe1.sort(intArray);
        String solution = "1,2,3,4,5,6,7,8,9,10,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickMedianIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickMedianIntsSorted()
    {
        QuicksortMedian quickMe1 = new QuicksortMedian();
        int [] intArray = {1,2,3,4,5,6,7,8,9,10};
        quickMe1.sort(intArray);
        String solution = "1,2,3,4,5,6,7,8,9,10,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickMedianIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickMedianIntsWorst()
    {
        QuicksortMedian quickMe1 = new QuicksortMedian();
        int [] intArray = {10,9,8,7,6,5,4,3,2,1};
        quickMe1.sort(intArray);
        String solution = "1,2,3,4,5,6,7,8,9,10,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickMedianIntsWorst: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickMedianStringsRand()
    {
        QuicksortMedian quickMe1 = new QuicksortMedian();
        String [] stringArray = {"ac","ad","aa","ab","ae"};
        quickMe1.sort(stringArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < stringArray.length; i ++) {
            output = output + "" + stringArray[i] + ",";
        }
        System.out.println("quickMedianStringsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickMedianStringsSorted()
    {
        QuicksortMedian quickMe1 = new QuicksortMedian();
        String [] stringArray = {"aa","ab","ac","ad","ae"};
        quickMe1.sort(stringArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < stringArray.length; i ++) {
            output = output + "" + stringArray[i] + ",";
        }
        System.out.println("quickMedianStringsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickMedianStringsWorst()
    {
        QuicksortMedian quickMe1 = new QuicksortMedian();
        String [] stringArray = {"ae","ad","ac","ab","aa"};
        quickMe1.sort(stringArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < stringArray.length; i ++) {
            output = output + "" + stringArray[i] + ",";
        }
        System.out.println("quickMedianStringsWorst: " + output);
        assertEquals(solution, output);
    }
}
