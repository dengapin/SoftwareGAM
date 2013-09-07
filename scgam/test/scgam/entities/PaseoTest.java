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
public class PaseoTest {
    
    public PaseoTest() {
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
     * Test of getIdPaseo method, of class Paseo.
     */
    @Test
    public void testGetIdPaseo() {
        System.out.println("getIdPaseo");
        Paseo instance = new Paseo();
        Integer expResult = null;
        Integer result = instance.getIdPaseo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPaseo method, of class Paseo.
     */
    @Test
    public void testSetIdPaseo() {
        System.out.println("setIdPaseo");
        Integer idPaseo = null;
        Paseo instance = new Paseo();
        instance.setIdPaseo(idPaseo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTema method, of class Paseo.
     */
    @Test
    public void testGetTema() {
        System.out.println("getTema");
        Paseo instance = new Paseo();
        String expResult = "";
        String result = instance.getTema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTema method, of class Paseo.
     */
    @Test
    public void testSetTema() {
        System.out.println("setTema");
        String tema = "";
        Paseo instance = new Paseo();
        instance.setTema(tema);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacidad method, of class Paseo.
     */
    @Test
    public void testGetCapacidad() {
        System.out.println("getCapacidad");
        Paseo instance = new Paseo();
        int expResult = 0;
        int result = instance.getCapacidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacidad method, of class Paseo.
     */
    @Test
    public void testSetCapacidad() {
        System.out.println("setCapacidad");
        int capacidad = 0;
        Paseo instance = new Paseo();
        instance.setCapacidad(capacidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuracion method, of class Paseo.
     */
    @Test
    public void testGetDuracion() {
        System.out.println("getDuracion");
        Paseo instance = new Paseo();
        Integer expResult = null;
        Integer result = instance.getDuracion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuracion method, of class Paseo.
     */
    @Test
    public void testSetDuracion() {
        System.out.println("setDuracion");
        Integer duracion = null;
        Paseo instance = new Paseo();
        instance.setDuracion(duracion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdVehiculo method, of class Paseo.
     */
    @Test
    public void testGetIdVehiculo() {
        System.out.println("getIdVehiculo");
        Paseo instance = new Paseo();
        Vehiculo expResult = null;
        Vehiculo result = instance.getIdVehiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdVehiculo method, of class Paseo.
     */
    @Test
    public void testSetIdVehiculo() {
        System.out.println("setIdVehiculo");
        Vehiculo idVehiculo = null;
        Paseo instance = new Paseo();
        instance.setIdVehiculo(idVehiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUser method, of class Paseo.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Paseo instance = new Paseo();
        Usuario expResult = null;
        Usuario result = instance.getIdUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUser method, of class Paseo.
     */
    @Test
    public void testSetIdUser() {
        System.out.println("setIdUser");
        Usuario idUser = null;
        Paseo instance = new Paseo();
        instance.setIdUser(idUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Paseo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Paseo instance = new Paseo();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Paseo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Paseo instance = new Paseo();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Paseo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Paseo instance = new Paseo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}