/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.awt.event.ActionEvent;
import modelos.Personal;
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
public class loginBeanTest {
    
    public loginBeanTest() {
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
     * Test of getPersonal method, of class loginBean.
     */
    @Test
    public void testGetPersonal() {
        System.out.println("getPersonal");
        loginBean instance = new loginBean();
        Personal expResult = null;
        Personal result = instance.getPersonal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonal method, of class loginBean.
     */
    @Test
    public void testSetPersonal() {
        System.out.println("setPersonal");
        Personal personal = null;
        loginBean instance = new loginBean();
        instance.setPersonal(personal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class loginBean.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        ActionEvent actionEvent = null;
        loginBean instance = new loginBean();
        instance.login(actionEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class loginBean.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        loginBean instance = new loginBean();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}