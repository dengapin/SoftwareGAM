/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.entities;

import java.util.Collection;
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
public class RolTest {
    
    public RolTest() {
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
     * Test of getIdRol method, of class Rol.
     */
    @Test
    public void testGetIdRol() {
        System.out.println("getIdRol");
        Rol instance = new Rol();
        Integer expResult = null;
        Integer result = instance.getIdRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdRol method, of class Rol.
     */
    @Test
    public void testSetIdRol() {
        System.out.println("setIdRol");
        Integer idRol = null;
        Rol instance = new Rol();
        instance.setIdRol(idRol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Rol.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Rol instance = new Rol();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Rol.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Rol instance = new Rol();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Rol.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Rol instance = new Rol();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Rol.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Rol instance = new Rol();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Rol.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Rol instance = new Rol();
        Short expResult = null;
        Short result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Rol.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        Short estado = null;
        Rol instance = new Rol();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolmenuCollection method, of class Rol.
     */
    @Test
    public void testGetRolmenuCollection() {
        System.out.println("getRolmenuCollection");
        Rol instance = new Rol();
        Collection expResult = null;
        Collection result = instance.getRolmenuCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRolmenuCollection method, of class Rol.
     */
    @Test
    public void testSetRolmenuCollection() {
        System.out.println("setRolmenuCollection");
        Collection<Rolmenu> rolmenuCollection = null;
        Rol instance = new Rol();
        instance.setRolmenuCollection(rolmenuCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonalCollection method, of class Rol.
     */
    @Test
    public void testGetPersonalCollection() {
        System.out.println("getPersonalCollection");
        Rol instance = new Rol();
        Collection expResult = null;
        Collection result = instance.getPersonalCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonalCollection method, of class Rol.
     */
    @Test
    public void testSetPersonalCollection() {
        System.out.println("setPersonalCollection");
        Collection<Personal> personalCollection = null;
        Rol instance = new Rol();
        instance.setPersonalCollection(personalCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Rol.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Rol instance = new Rol();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Rol.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Rol instance = new Rol();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rol.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Rol instance = new Rol();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}