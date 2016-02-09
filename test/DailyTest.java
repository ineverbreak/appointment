/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SMoitra
 */
public class DailyTest {
    
    public DailyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of occursOn method, of class Daily.
     */
    @Test
    public void testOccursOn() {
        System.out.println("occursOn");
        int year = 2001;
        int month = 8;
        int day = 13;
        Daily instance = new Daily(2001, 8, 13, "Comb your hair");
        boolean expResult = true;
        boolean result = instance.occursOn(year, month, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}