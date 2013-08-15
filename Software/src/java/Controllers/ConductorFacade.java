/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import entities.Conductor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dennise
 */
@Stateless
public class ConductorFacade extends AbstractFacade<Conductor> {
    @PersistenceContext(unitName = "SoftwarePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConductorFacade() {
        super(Conductor.class);
    }
    
}
