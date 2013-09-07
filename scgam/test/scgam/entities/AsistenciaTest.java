/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.entities;

import java.util.Date;
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
public class AsistenciaTest {
    
    public AsistenciaTest() {
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
     * Test of getIdAsistencia method, of class Asistencia.
     */
    @Test
    public void testGetIdAsistencia() {
        System.out.println("getIdAsistencia");
        Asistencia instance = new Asistencia();
        Integer expResult = null;
        Integer result = instance.getIdAsistencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAsistencia method, of class Asistencia.
     */
    @Test
    public void testSetIdAsistencia() {
        System.out.println("setIdAsistencia");
        Integer idAsistencia = null;
        Asistencia instance = new Asistencia();
        instance.setIdAsistencia(idAsistencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Asistencia.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Asistencia instance = new Asistencia();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Asistencia.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Asistencia instance = new Asistencia();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Asistencia.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Asistencia instance = new Asistencia();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Asistencia.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Asistencia instance = new Asistencia();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUser1 method, of class Asistencia.
     */
    @Test
    public void testGetIdUser1() {
        System.out.println("getIdUser1");
        Asistencia instance = new Asistencia();
        Usuario expResult = null;
        Usuario result = instance.getIdUser1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUser1 method, of class Asistencia.
     */
    @Test
    public void testSetIdUser1() {
        System.out.println("setIdUser1");
        Usuario idUser1 = null;
        Asistencia instance = new Asistencia();
        instance.setIdUser1(idUser1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Asistencia.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Asistencia instance = new Asistencia();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Asistencia.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Asistencia instance = new Asistencia();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Asistencia.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Asistencia instance = new Asistencia();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}