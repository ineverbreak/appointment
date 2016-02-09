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
public class MonthlyTest {
    
    public MonthlyTest() {
    }
    

    /**
     * Test of occursOn method, of class Monthly.
     */
    @Test
    public void testOccursOn() {
        System.out.println("occursOn");
        int year = 2000;
        int month = 8;
        int day = 13;
        Monthly instance = new Monthly(year, month, day, "Brush your teeth");
        boolean expResult = true;
        boolean result = instance.occursOn(year, month, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}