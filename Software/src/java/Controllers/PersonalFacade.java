/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import entities.Personal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dennise
 */
@Stateless
public class PersonalFacade extends AbstractFacade<Personal> {
    @PersistenceContext(unitName = "SoftwarePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonalFacade() {
        super(Personal.class);
    }
    
}
