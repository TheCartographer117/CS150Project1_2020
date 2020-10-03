

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
        int [] intArray = {3,5,2,4,1};
        quickMe1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickMedianIntsRand: " + output);
        assertEquals(output, solution);
    }
    
    @Test
    public void testQuickMedianIntsSorted()
    {
        QuicksortMedian quickMe1 = new QuicksortMedian();
        int [] intArray = {1,2,3,4,5};
        quickMe1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickMedianIntsSorted: " + output);
        assertEquals(output, solution);
    }
    
    @Test
    public void testQuickMedianIntsWorst()
    {
        QuicksortMedian quickMe1 = new QuicksortMedian();
        int [] intArray = {5,4,3,2,1};
        quickMe1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickMedianIntsWorst: " + output);
        assertEquals(output, solution);
    }
}
