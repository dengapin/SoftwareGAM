/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.Interfaces;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import scgam.model.Personal;

/**
 *
 * @author Dennise
 */
public interface PersonalDao {
    public Personal findByPersonal(Personal personal);
    public Personal login(Personal personal);
}
