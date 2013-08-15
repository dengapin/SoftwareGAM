/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import entities.Paseo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dennise
 */
@Stateless
public class PaseoFacade extends AbstractFacade<Paseo> {
    @PersistenceContext(unitName = "SoftwarePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaseoFacade() {
        super(Paseo.class);
    }
    
}
