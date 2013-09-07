/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
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
public class PersonalConverterTest {
    
    public PersonalConverterTest() {
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
     * Test of getAsObject method, of class PersonalConverter.
     */
    @Test
    public void testGetAsObject() {
        System.out.println("getAsObject");
        FacesContext facesContext = null;
        UIComponent component = null;
        String value = "";
        PersonalConverter instance = new PersonalConverter();
        Object expResult = null;
        Object result = instance.getAsObject(facesContext, component, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class PersonalConverter.
     */
    @Test
    public void testGetKey() {
        System.out.println("getKey");
        String value = "";
        PersonalConverter instance = new PersonalConverter();
        Integer expResult = null;
        Integer result = instance.getKey(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringKey method, of class PersonalConverter.
     */
    @Test
    public void testGetStringKey() {
        System.out.println("getStringKey");
        Integer value = null;
        PersonalConverter instance = new PersonalConverter();
        String expResult = "";
        String result = instance.getStringKey(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAsString method, of class PersonalConverter.
     */
    @Test
    public void testGetAsString() {
        System.out.println("getAsString");
        FacesContext facesContext = null;
        UIComponent component = null;
        Object object = null;
        PersonalConverter instance = new PersonalConverter();
        String expResult = "";
        String result = instance.getAsString(facesContext, component, object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}