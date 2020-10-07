
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuicksortRandTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuicksortRandTest
{
    /**
     * Default constructor for test class QuicksortRandTest
     */
    public QuicksortRandTest()
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
    public void testQuickRandIntsRand()
    {
        QuicksortRand quickRa1 = new QuicksortRand(2100);
        int [] intArray = {3,5,2,4,1};
        quickRa1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickRandIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickRandIntsSorted()
    {
        QuicksortRand quickRa1 = new QuicksortRand(2100);
        int [] intArray = {1,2,3,4,5};
        quickRa1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickRandIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickRandIntsWorst()
    {
        QuicksortRand quickRa1 = new QuicksortRand(2100);
        int [] intArray = {5,4,3,2,1};
        quickRa1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickRandIntsWorst: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickRandStringsRand()
    {
        QuicksortRand quickRa1 = new QuicksortRand(2100);
        String [] intArray = {"ac","ad","aa","ab","ae"};
        quickRa1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickRandIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickRandStringsSorted()
    {
        QuicksortRand quickRa1 = new QuicksortRand(2100);
        String [] intArray = {"aa","ab","ac","ad","ae"};
        quickRa1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickRandIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickRandStringsWorst()
    {
        QuicksortRand quickRa1 = new QuicksortRand(2100);
        String [] intArray = {"ae","ad","ac","ab","aa"};
        quickRa1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickRandIntsWorst: " + output);
        assertEquals(solution, output);
    }
}
