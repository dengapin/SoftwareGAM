/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Rolmenu;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dennise
 */
@Stateless
public class RolmenuFacade extends AbstractFacade<Rolmenu> {
    @PersistenceContext(unitName = "SCGAMPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolmenuFacade() {
        super(Rolmenu.class);
    }
    
}
