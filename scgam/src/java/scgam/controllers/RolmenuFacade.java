/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import scgam.entities.Rolmenu;

/**
 *
 * @author Dennise
 */
@Stateless
public class RolmenuFacade extends AbstractFacade<Rolmenu> {
    @PersistenceContext(unitName = "scgamPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolmenuFacade() {
        super(Rolmenu.class);
    }
    
}
