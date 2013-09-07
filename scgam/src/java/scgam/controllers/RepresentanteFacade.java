/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import scgam.entities.Representante;

/**
 *
 * @author Dennise
 */
@Stateless
public class RepresentanteFacade extends AbstractFacade<Representante> {
    @PersistenceContext(unitName = "scgamPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RepresentanteFacade() {
        super(Representante.class);
    }
    
}
