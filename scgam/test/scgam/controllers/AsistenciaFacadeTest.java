/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.controllers;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import scgam.entities.Asistencia;

/**
 *
 * @author Dennise
 */
public class AsistenciaFacadeTest {
    
    public AsistenciaFacadeTest() {
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
     * Test of create method, of class AsistenciaFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Asistencia entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsistenciaFacade instance = (AsistenciaFacade)container.getContext().lookup("java:global/classes/AsistenciaFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AsistenciaFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Asistencia entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsistenciaFacade instance = (AsistenciaFacade)container.getContext().lookup("java:global/classes/AsistenciaFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AsistenciaFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Asistencia entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsistenciaFacade instance = (AsistenciaFacade)container.getContext().lookup("java:global/classes/AsistenciaFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AsistenciaFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsistenciaFacade instance = (AsistenciaFacade)container.getContext().lookup("java:global/classes/AsistenciaFacade");
        Asistencia expResult = null;
        Asistencia result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AsistenciaFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsistenciaFacade instance = (AsistenciaFacade)container.getContext().lookup("java:global/classes/AsistenciaFacade");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class AsistenciaFacade.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsistenciaFacade instance = (AsistenciaFacade)container.getContext().lookup("java:global/classes/AsistenciaFacade");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AsistenciaFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AsistenciaFacade instance = (AsistenciaFacade)container.getContext().lookup("java:global/classes/AsistenciaFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}