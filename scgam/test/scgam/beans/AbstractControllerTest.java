/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.beans;

import java.util.List;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import scgam.controllers.AbstractFacade;

/**
 *
 * @author Dennise
 */
public class AbstractControllerTest {
    
    public AbstractControllerTest() {
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
     * Test of getFacade method, of class AbstractController.
     */
    @Test
    public void testGetFacade() {
        System.out.println("getFacade");
        AbstractController instance = new AbstractControllerImpl();
        AbstractFacade expResult = null;
        AbstractFacade result = instance.getFacade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFacade method, of class AbstractController.
     */
    @Test
    public void testSetFacade() {
        System.out.println("setFacade");
        AbstractController instance = new AbstractControllerImpl();
        instance.setFacade(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelected method, of class AbstractController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        AbstractController instance = new AbstractControllerImpl();
        Object expResult = null;
        Object result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class AbstractController.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        Object selected = null;
        AbstractController instance = new AbstractControllerImpl();
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmbeddableKeys method, of class AbstractController.
     */
    @Test
    public void testSetEmbeddableKeys() {
        System.out.println("setEmbeddableKeys");
        AbstractController instance = new AbstractControllerImpl();
        instance.setEmbeddableKeys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeEmbeddableKey method, of class AbstractController.
     */
    @Test
    public void testInitializeEmbeddableKey() {
        System.out.println("initializeEmbeddableKey");
        AbstractController instance = new AbstractControllerImpl();
        instance.initializeEmbeddableKey();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class AbstractController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        AbstractController instance = new AbstractControllerImpl();
        List expResult = null;
        List result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class AbstractController.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        ActionEvent event = null;
        AbstractController instance = new AbstractControllerImpl();
        instance.save(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveNew method, of class AbstractController.
     */
    @Test
    public void testSaveNew() {
        System.out.println("saveNew");
        ActionEvent event = null;
        AbstractController instance = new AbstractControllerImpl();
        instance.saveNew(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AbstractController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        ActionEvent event = null;
        AbstractController instance = new AbstractControllerImpl();
        instance.delete(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class AbstractController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        ActionEvent event = null;
        AbstractController instance = new AbstractControllerImpl();
        Object expResult = null;
        Object result = instance.prepareCreate(event);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class AbstractController.
     */
    @Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        AbstractController instance = new AbstractControllerImpl();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectMany();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectOne method, of class AbstractController.
     */
    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        AbstractController instance = new AbstractControllerImpl();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectOne();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractControllerImpl extends AbstractController {
    }
}