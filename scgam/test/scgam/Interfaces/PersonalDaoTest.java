/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.Interfaces;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import scgam.model.Personal;

/**
 *
 * @author Dennise
 */
public class PersonalDaoTest {
    
    public PersonalDaoTest() {
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
     * Test of findByPersonal method, of class PersonalDao.
     */
    @Test
    public void testFindByPersonal() {
        System.out.println("findByPersonal");
        Personal personal = null;
        PersonalDao instance = new PersonalDaoImpl();
        Personal expResult = null;
        Personal result = instance.findByPersonal(personal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class PersonalDao.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Personal personal = null;
        PersonalDao instance = new PersonalDaoImpl();
        Personal expResult = null;
        Personal result = instance.login(personal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonalDaoImpl implements PersonalDao {

        public Personal findByPersonal(Personal personal) {
            return null;
        }

        public Personal login(Personal personal) {
            return null;
        }
    }
}