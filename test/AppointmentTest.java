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
public class AppointmentTest {
    
    public AppointmentTest() {
    }
    


    /**
     * Test of getYear method, of class Appointment.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Appointment instance = new Appointment(2000, 8, 13, "Brush your teeth");
        int expResult = 2000;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class Appointment.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Appointment instance = new Appointment(2000, 8, 13, "Brush your teeth");
        int expResult = 8;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Appointment.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Appointment instance = new Appointment(2000, 8, 13, "Brush your teeth");
        int expResult = 13;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of occursOn method, of class Appointment.
     */
    @Test
    public void testOccursOn() {
        System.out.println("occursOn");
        int year = 2000;
        int month = 8;
        int day = 13;
        Appointment instance = new Appointment(2000, 8, 13, "Brush your teeth");
        boolean expResult = false;
        boolean result = instance.occursOn(year, month, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Appointment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Appointment instance = new Appointment(2000, 8, 13, "Brush your teeth");
        String expResult = "Brush your teeth";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}