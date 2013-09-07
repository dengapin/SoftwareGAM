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
public class VehiculoTest {
    
    public VehiculoTest() {
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
     * Test of getIdVehiculo method, of class Vehiculo.
     */
    @Test
    public void testGetIdVehiculo() {
        System.out.println("getIdVehiculo");
        Vehiculo instance = new Vehiculo();
        Integer expResult = null;
        Integer result = instance.getIdVehiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdVehiculo method, of class Vehiculo.
     */
    @Test
    public void testSetIdVehiculo() {
        System.out.println("setIdVehiculo");
        Integer idVehiculo = null;
        Vehiculo instance = new Vehiculo();
        instance.setIdVehiculo(idVehiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Vehiculo.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Vehiculo.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Vehiculo instance = new Vehiculo();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacidad method, of class Vehiculo.
     */
    @Test
    public void testGetCapacidad() {
        System.out.println("getCapacidad");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getCapacidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacidad method, of class Vehiculo.
     */
    @Test
    public void testSetCapacidad() {
        System.out.println("setCapacidad");
        String capacidad = "";
        Vehiculo instance = new Vehiculo();
        instance.setCapacidad(capacidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacion method, of class Vehiculo.
     */
    @Test
    public void testGetObservacion() {
        System.out.println("getObservacion");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getObservacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacion method, of class Vehiculo.
     */
    @Test
    public void testSetObservacion() {
        System.out.println("setObservacion");
        String observacion = "";
        Vehiculo instance = new Vehiculo();
        instance.setObservacion(observacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaseoCollection method, of class Vehiculo.
     */
    @Test
    public void testGetPaseoCollection() {
        System.out.println("getPaseoCollection");
        Vehiculo instance = new Vehiculo();
        Collection expResult = null;
        Collection result = instance.getPaseoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaseoCollection method, of class Vehiculo.
     */
    @Test
    public void testSetPaseoCollection() {
        System.out.println("setPaseoCollection");
        Collection<Paseo> paseoCollection = null;
        Vehiculo instance = new Vehiculo();
        instance.setPaseoCollection(paseoCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConductorN method, of class Vehiculo.
     */
    @Test
    public void testGetConductorN() {
        System.out.println("getConductorN");
        Vehiculo instance = new Vehiculo();
        Conductor expResult = null;
        Conductor result = instance.getConductorN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConductorN method, of class Vehiculo.
     */
    @Test
    public void testSetConductorN() {
        System.out.println("setConductorN");
        Conductor conductorN = null;
        Vehiculo instance = new Vehiculo();
        instance.setConductorN(conductorN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Vehiculo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Vehiculo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Vehiculo instance = new Vehiculo();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vehiculo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}