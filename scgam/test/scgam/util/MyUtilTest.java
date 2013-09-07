/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dennise
 */
public class MyUtilTest {
    
    public MyUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of baseurl method, of class MyUtil.
     */
    @Test
    public void testBaseurl() {
        System.out.println("baseurl");
        String expResult = "";
        String result = MyUtil.baseurl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of basepathlogin method, of class MyUtil.
     */
    @Test
    public void testBasepathlogin() {
        System.out.println("basepathlogin");
        String expResult = "";
        String result = MyUtil.basepathlogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of basepath method, of class MyUtil.
     */
    @Test
    public void testBasepath() {
        System.out.println("basepath");
        String expResult = "";
        String result = MyUtil.basepath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}