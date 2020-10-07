import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BubbleSortTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BubbleSortTest
{
    /**
     * Default constructor for test class BubbleSortTest
     */
    public BubbleSortTest()
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
    public void testBubbleIntsRand()
    {
        BubbleSort bubbleSo1 = new BubbleSort();
        int [] intArray = {3,5,2,4,1};
        bubbleSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("bubbleIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testBubbleIntsSorted()
    {
        BubbleSort bubbleSo1 = new BubbleSort();
        int [] intArray = {1,2,3,4,5};
        bubbleSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("bubbleIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testBubbleIntsWorst()
    {
        BubbleSort bubbleSo1 = new BubbleSort();
        int [] intArray = {5,4,3,2,1};
        bubbleSo1.sort(intArray);
        String solution = "1,2,3,4,5,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("bubbleIntsWorst: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testBubbleStringsRand()
    {
        BubbleSort bubbleSo1 = new BubbleSort();
        String [] intArray = {"ac","ad","aa","ab","ae"};
        bubbleSo1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("bubbleIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testBubbleStringsSorted()
    {
        BubbleSort bubbleSo1 = new BubbleSort();
        String [] intArray = {"aa","ab","ac","ad","ae"};
        bubbleSo1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("bubbleIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testBubbleStringsWorst()
    {
        BubbleSort bubbleSo1 = new BubbleSort();
        String [] intArray = {"ae","ad","ac","ab","aa"};
        bubbleSo1.sort(intArray);
        String solution = "aa,ab,ac,ad,ae,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("bubbleIntsWorst: " + output);
        assertEquals(solution, output);
    }
}
