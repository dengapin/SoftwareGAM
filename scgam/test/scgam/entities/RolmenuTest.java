/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.entities;

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
public class RolmenuTest {
    
    public RolmenuTest() {
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
     * Test of getIdRolMenu method, of class Rolmenu.
     */
    @Test
    public void testGetIdRolMenu() {
        System.out.println("getIdRolMenu");
        Rolmenu instance = new Rolmenu();
        Integer expResult = null;
        Integer result = instance.getIdRolMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdRolMenu method, of class Rolmenu.
     */
    @Test
    public void testSetIdRolMenu() {
        System.out.println("setIdRolMenu");
        Integer idRolMenu = null;
        Rolmenu instance = new Rolmenu();
        instance.setIdRolMenu(idRolMenu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdRol method, of class Rolmenu.
     */
    @Test
    public void testGetIdRol() {
        System.out.println("getIdRol");
        Rolmenu instance = new Rolmenu();
        Rol expResult = null;
        Rol result = instance.getIdRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdRol method, of class Rolmenu.
     */
    @Test
    public void testSetIdRol() {
        System.out.println("setIdRol");
        Rol idRol = null;
        Rolmenu instance = new Rolmenu();
        instance.setIdRol(idRol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdMenu method, of class Rolmenu.
     */
    @Test
    public void testGetIdMenu() {
        System.out.println("getIdMenu");
        Rolmenu instance = new Rolmenu();
        Menu expResult = null;
        Menu result = instance.getIdMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMenu method, of class Rolmenu.
     */
    @Test
    public void testSetIdMenu() {
        System.out.println("setIdMenu");
        Menu idMenu = null;
        Rolmenu instance = new Rolmenu();
        instance.setIdMenu(idMenu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Rolmenu.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Rolmenu instance = new Rolmenu();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Rolmenu.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Rolmenu instance = new Rolmenu();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rolmenu.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Rolmenu instance = new Rolmenu();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}