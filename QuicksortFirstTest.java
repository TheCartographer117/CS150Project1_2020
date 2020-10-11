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
public class QuicksortFirstTest {
    /**
     * Default constructor for test class QuicksortFirstTest
     */
    public QuicksortFirstTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
    @Test
    public void testQuickFirstIntsRand() {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        int [] intArray = {3,5,2,4,1,7,8,6,9,10};
        quickFi1.sort(intArray);
        String solution = "1,2,3,4,5,6,7,8,9,10,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickFirstIntsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstIntsSorted() {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        int [] intArray = {1,2,3,4,5,6,7,8,9,10};
        quickFi1.sort(intArray);
        String solution = "1,2,3,4,5,6,7,8,9,10,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickFirstIntsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstIntsWorst() {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        int [] intArray = {10,9,8,7,6,5,4,3,2,1};
        quickFi1.sort(intArray);
        String solution = "1,2,3,4,5,6,7,8,9,10,";
        String output = new String();
        for (int i = 0; i < intArray.length; i ++) {
            output = output + "" + intArray[i] + ",";
        }
        System.out.println("quickFirstIntsWorst: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstStringsRand() {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        String [] stringArray = {"ac","ad","aa","ab","ae","ah","ag","af"};
        quickFi1.sort(stringArray);
        String solution = "aa,ab,ac,ad,ae,af,ag,ah,";
        String output = new String();
        for (int i = 0; i < stringArray.length; i ++) {
            output = output + "" + stringArray[i] + ",";
        }
        System.out.println("quickFirstStringsRand: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstStringsSorted() {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        String [] stringArray = {"aa","ab","ac","ad","ae","af","ag","ah"};
        quickFi1.sort(stringArray);
        String solution = "aa,ab,ac,ad,ae,af,ag,ah,";
        String output = new String();
        for (int i = 0; i < stringArray.length; i ++) {
            output = output + "" + stringArray[i] + ",";
        }
        System.out.println("quickFirstStringsSorted: " + output);
        assertEquals(solution, output);
    }
    
    @Test
    public void testQuickFirstStringsWorst() {
        QuicksortFirst quickFi1 = new QuicksortFirst();
        String [] stringArray = {"ah","ag","af","ae","ad","ac","ab","aa"};
        quickFi1.sort(stringArray);
        String solution = "aa,ab,ac,ad,ae,af,ag,ah,";
        String output = new String();
        for (int i = 0; i < stringArray.length; i ++) {
            output = output + "" + stringArray[i] + ",";
        }
        System.out.println("quickFirstStringsWorst: " + output);
        assertEquals(solution, output);
    }
}
