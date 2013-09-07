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
import scgam.entities.Rolmenu;

/**
 *
 * @author Dennise
 */
public class RolmenuFacadeTest {
    
    public RolmenuFacadeTest() {
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
     * Test of create method, of class RolmenuFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Rolmenu entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RolmenuFacade instance = (RolmenuFacade)container.getContext().lookup("java:global/classes/RolmenuFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class RolmenuFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Rolmenu entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RolmenuFacade instance = (RolmenuFacade)container.getContext().lookup("java:global/classes/RolmenuFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class RolmenuFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Rolmenu entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RolmenuFacade instance = (RolmenuFacade)container.getContext().lookup("java:global/classes/RolmenuFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class RolmenuFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RolmenuFacade instance = (RolmenuFacade)container.getContext().lookup("java:global/classes/RolmenuFacade");
        Rolmenu expResult = null;
        Rolmenu result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class RolmenuFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RolmenuFacade instance = (RolmenuFacade)container.getContext().lookup("java:global/classes/RolmenuFacade");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class RolmenuFacade.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RolmenuFacade instance = (RolmenuFacade)container.getContext().lookup("java:global/classes/RolmenuFacade");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class RolmenuFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RolmenuFacade instance = (RolmenuFacade)container.getContext().lookup("java:global/classes/RolmenuFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}