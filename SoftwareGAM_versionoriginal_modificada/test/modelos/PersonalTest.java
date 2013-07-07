/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

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
public class PersonalTest {
    
    public PersonalTest() {
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
     * Test of getIdPersonal method, of class Personal.
     */
    @Test
    public void testGetIdPersonal() {
        System.out.println("getIdPersonal");
        Personal instance = new Personal();
        Integer expResult = null;
        Integer result = instance.getIdPersonal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPersonal method, of class Personal.
     */
    @Test
    public void testSetIdPersonal() {
        System.out.println("setIdPersonal");
        Integer idPersonal = null;
        Personal instance = new Personal();
        instance.setIdPersonal(idPersonal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRol method, of class Personal.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
        Personal instance = new Personal();
        Rol expResult = null;
        Rol result = instance.getRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRol method, of class Personal.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
        Rol rol = null;
        Personal instance = new Personal();
        instance.setRol(rol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Personal.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Personal instance = new Personal();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Personal.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Personal instance = new Personal();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Personal.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Personal instance = new Personal();
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Personal.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Personal instance = new Personal();
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Personal.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Personal instance = new Personal();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Personal.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        Personal instance = new Personal();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClave method, of class Personal.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        Personal instance = new Personal();
        String expResult = "";
        String result = instance.getClave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClave method, of class Personal.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String clave = "";
        Personal instance = new Personal();
        instance.setClave(clave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Personal.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Personal instance = new Personal();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Personal.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Personal instance = new Personal();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Personal.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Personal instance = new Personal();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Personal.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Personal instance = new Personal();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaCreacion method, of class Personal.
     */
    @Test
    public void testGetFechaCreacion() {
        System.out.println("getFechaCreacion");
        Personal instance = new Personal();
        Date expResult = null;
        Date result = instance.getFechaCreacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaCreacion method, of class Personal.
     */
    @Test
    public void testSetFechaCreacion() {
        System.out.println("setFechaCreacion");
        Date fechaCreacion = null;
        Personal instance = new Personal();
        instance.setFechaCreacion(fechaCreacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsaurioModificacion method, of class Personal.
     */
    @Test
    public void testGetUsaurioModificacion() {
        System.out.println("getUsaurioModificacion");
        Personal instance = new Personal();
        String expResult = "";
        String result = instance.getUsaurioModificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsaurioModificacion method, of class Personal.
     */
    @Test
    public void testSetUsaurioModificacion() {
        System.out.println("setUsaurioModificacion");
        String usaurioModificacion = "";
        Personal instance = new Personal();
        instance.setUsaurioModificacion(usaurioModificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaModificacion method, of class Personal.
     */
    @Test
    public void testGetFechaModificacion() {
        System.out.println("getFechaModificacion");
        Personal instance = new Personal();
        Date expResult = null;
        Date result = instance.getFechaModificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaModificacion method, of class Personal.
     */
    @Test
    public void testSetFechaModificacion() {
        System.out.println("setFechaModificacion");
        Date fechaModificacion = null;
        Personal instance = new Personal();
        instance.setFechaModificacion(fechaModificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}