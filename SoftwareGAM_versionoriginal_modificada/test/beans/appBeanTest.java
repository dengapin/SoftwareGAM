/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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
public class appBeanTest {
    
    public appBeanTest() {
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
     * Test of getBaseUrl method, of class appBean.
     */
    @Test
    public void testGetBaseUrl() {
        System.out.println("getBaseUrl");
        appBean instance = new appBean();
        String expResult = "";
        String result = instance.getBaseUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBasePath method, of class appBean.
     */
    @Test
    public void testGetBasePath() {
        System.out.println("getBasePath");
        appBean instance = new appBean();
        String expResult = "";
        String result = instance.getBasePath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}