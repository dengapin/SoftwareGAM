/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.*;
import dao.*;
import java.util.List;
import modelos.Rol;
import modelos.Usuario;

/**
 *
 * @author Dennise
 */
public interface RolDao {
    public Rol findByRol(Rol rol);
     public List<Rol> findAll();
    




}
