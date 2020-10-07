import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuicksortFirstTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuicksortFirstTest
{
    /**
     * Default constructor for test class QuicksortFirstTest
     */
    public QuicksortFirstTest()
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
    public void testQuickFirstIntsRand()
    {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        int [] intArray = {3,5,2,4,1};
        quickFi1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickFirstIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstIntsSorted()
    {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        int [] intArray = {1,2,3,4,5};
        quickFi1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickFirstIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstIntsWorst()
    {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        int [] intArray = {5,4,3,2,1};
        quickFi1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickFirstIntsWorst: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstStringsRand()
    {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        String [] intArray = {"ac","ad","aa","ab","ae"};
        quickFi1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickFirstIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstStringsSorted()
    {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        String [] intArray = {"aa","ab","ac","ad","ae"};
        quickFi1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickFirstIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstStringsWorst()
    {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        String [] intArray = {"ae","ad","ac","ab","aa"};
        quickFi1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickFirstIntsWorst: " + output);
        assertEquals(solution, output);
    }
}
