/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Set;
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
        Byte expResult = null;
        Byte result = instance.getEstado();
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
        Byte estado = null;
        Rol instance = new Rol();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonals method, of class Rol.
     */
    @Test
    public void testGetPersonals() {
        System.out.println("getPersonals");
        Rol instance = new Rol();
        Set expResult = null;
        Set result = instance.getPersonals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonals method, of class Rol.
     */
    @Test
    public void testSetPersonals() {
        System.out.println("setPersonals");
        Set personals = null;
        Rol instance = new Rol();
        instance.setPersonals(personals);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolmenus method, of class Rol.
     */
    @Test
    public void testGetRolmenus() {
        System.out.println("getRolmenus");
        Rol instance = new Rol();
        Set expResult = null;
        Set result = instance.getRolmenus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRolmenus method, of class Rol.
     */
    @Test
    public void testSetRolmenus() {
        System.out.println("setRolmenus");
        Set rolmenus = null;
        Rol instance = new Rol();
        instance.setRolmenus(rolmenus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}