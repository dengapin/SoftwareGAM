/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

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
     * Test of getVehiculo method, of class Paseo.
     */
    @Test
    public void testGetVehiculo() {
        System.out.println("getVehiculo");
        Paseo instance = new Paseo();
        Vehiculo expResult = null;
        Vehiculo result = instance.getVehiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVehiculo method, of class Paseo.
     */
    @Test
    public void testSetVehiculo() {
        System.out.println("setVehiculo");
        Vehiculo vehiculo = null;
        Paseo instance = new Paseo();
        instance.setVehiculo(vehiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Paseo.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Paseo instance = new Paseo();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Paseo.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Paseo instance = new Paseo();
        instance.setUsuario(usuario);
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
        int expResult = 0;
        int result = instance.getDuracion();
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
        int duracion = 0;
        Paseo instance = new Paseo();
        instance.setDuracion(duracion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}