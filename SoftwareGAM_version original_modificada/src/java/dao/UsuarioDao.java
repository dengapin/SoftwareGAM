/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelos.Usuario;

/**
 *
 * @author User
 */
   public interface UsuarioDao {
    public Usuario findByUsuario(Usuario usuario);
   public List<Usuario> findAll();
    public boolean create(Usuario user);
    public boolean update(Usuario user);
  
  public boolean delete(Integer id);
}