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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getIdUsuario method, of class Usuario.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class Usuario.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        Integer idUsuario = null;
        Usuario instance = new Usuario();
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class Usuario.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombres method, of class Usuario.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Usuario instance = new Usuario();
        instance.setNombres(nombres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Usuario.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Usuario.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Usuario instance = new Usuario();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Usuario.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Usuario.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Usuario instance = new Usuario();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupo method, of class Usuario.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getGrupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupo method, of class Usuario.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        String grupo = "";
        Usuario instance = new Usuario();
        instance.setGrupo(grupo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Usuario.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Usuario.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Usuario instance = new Usuario();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCedula method, of class Usuario.
     */
    @Test
    public void testGetCedula() {
        System.out.println("getCedula");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCedula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCedula method, of class Usuario.
     */
    @Test
    public void testSetCedula() {
        System.out.println("setCedula");
        String cedula = "";
        Usuario instance = new Usuario();
        instance.setCedula(cedula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Usuario.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class Usuario.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Usuario instance = new Usuario();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Usuario.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Usuario.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Usuario instance = new Usuario();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Usuario.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Usuario.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Usuario instance = new Usuario();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoSangre method, of class Usuario.
     */
    @Test
    public void testGetTipoSangre() {
        System.out.println("getTipoSangre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTipoSangre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoSangre method, of class Usuario.
     */
    @Test
    public void testSetTipoSangre() {
        System.out.println("setTipoSangre");
        String tipoSangre = "";
        Usuario instance = new Usuario();
        instance.setTipoSangre(tipoSangre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Usuario.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Usuario.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Usuario instance = new Usuario();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfesion method, of class Usuario.
     */
    @Test
    public void testGetProfesion() {
        System.out.println("getProfesion");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getProfesion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfesion method, of class Usuario.
     */
    @Test
    public void testSetProfesion() {
        System.out.println("setProfesion");
        String profesion = "";
        Usuario instance = new Usuario();
        instance.setProfesion(profesion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConvivencia method, of class Usuario.
     */
    @Test
    public void testGetConvivencia() {
        System.out.println("getConvivencia");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getConvivencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConvivencia method, of class Usuario.
     */
    @Test
    public void testSetConvivencia() {
        System.out.println("setConvivencia");
        String convivencia = "";
        Usuario instance = new Usuario();
        instance.setConvivencia(convivencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatologia method, of class Usuario.
     */
    @Test
    public void testGetPatologia() {
        System.out.println("getPatologia");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPatologia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatologia method, of class Usuario.
     */
    @Test
    public void testSetPatologia() {
        System.out.println("setPatologia");
        String patologia = "";
        Usuario instance = new Usuario();
        instance.setPatologia(patologia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlergia method, of class Usuario.
     */
    @Test
    public void testGetAlergia() {
        System.out.println("getAlergia");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getAlergia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlergia method, of class Usuario.
     */
    @Test
    public void testSetAlergia() {
        System.out.println("setAlergia");
        String alergia = "";
        Usuario instance = new Usuario();
        instance.setAlergia(alergia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstruccion method, of class Usuario.
     */
    @Test
    public void testGetInstruccion() {
        System.out.println("getInstruccion");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getInstruccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInstruccion method, of class Usuario.
     */
    @Test
    public void testSetInstruccion() {
        System.out.println("setInstruccion");
        String instruccion = "";
        Usuario instance = new Usuario();
        instance.setInstruccion(instruccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicencia method, of class Usuario.
     */
    @Test
    public void testGetLicencia() {
        System.out.println("getLicencia");
        Usuario instance = new Usuario();
        Boolean expResult = null;
        Boolean result = instance.getLicencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLicencia method, of class Usuario.
     */
    @Test
    public void testSetLicencia() {
        System.out.println("setLicencia");
        Boolean licencia = null;
        Usuario instance = new Usuario();
        instance.setLicencia(licencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijos method, of class Usuario.
     */
    @Test
    public void testGetHijos() {
        System.out.println("getHijos");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getHijos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijos method, of class Usuario.
     */
    @Test
    public void testSetHijos() {
        System.out.println("setHijos");
        String hijos = "";
        Usuario instance = new Usuario();
        instance.setHijos(hijos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservaciones method, of class Usuario.
     */
    @Test
    public void testGetObservaciones() {
        System.out.println("getObservaciones");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getObservaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservaciones method, of class Usuario.
     */
    @Test
    public void testSetObservaciones() {
        System.out.println("setObservaciones");
        String observaciones = "";
        Usuario instance = new Usuario();
        instance.setObservaciones(observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIduserR method, of class Usuario.
     */
    @Test
    public void testGetIduserR() {
        System.out.println("getIduserR");
        Usuario instance = new Usuario();
        Representante expResult = null;
        Representante result = instance.getIduserR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIduserR method, of class Usuario.
     */
    @Test
    public void testSetIduserR() {
        System.out.println("setIduserR");
        Representante iduserR = null;
        Usuario instance = new Usuario();
        instance.setIduserR(iduserR);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaseoCollection method, of class Usuario.
     */
    @Test
    public void testGetPaseoCollection() {
        System.out.println("getPaseoCollection");
        Usuario instance = new Usuario();
        Collection expResult = null;
        Collection result = instance.getPaseoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaseoCollection method, of class Usuario.
     */
    @Test
    public void testSetPaseoCollection() {
        System.out.println("setPaseoCollection");
        Collection<Paseo> paseoCollection = null;
        Usuario instance = new Usuario();
        instance.setPaseoCollection(paseoCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAsistenciaCollection method, of class Usuario.
     */
    @Test
    public void testGetAsistenciaCollection() {
        System.out.println("getAsistenciaCollection");
        Usuario instance = new Usuario();
        Collection expResult = null;
        Collection result = instance.getAsistenciaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsistenciaCollection method, of class Usuario.
     */
    @Test
    public void testSetAsistenciaCollection() {
        System.out.println("setAsistenciaCollection");
        Collection<Asistencia> asistenciaCollection = null;
        Usuario instance = new Usuario();
        instance.setAsistenciaCollection(asistenciaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Usuario.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Usuario.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}