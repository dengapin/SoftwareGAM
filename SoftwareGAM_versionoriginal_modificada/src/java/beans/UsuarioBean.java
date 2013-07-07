/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import modelos.Usuario;
import dao.UsuarioDao;
import dao.UsuarioDaoImpl;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named(value = "usuarioBean")
@RequestScoped
public class UsuarioBean  {
private List<Usuario> usuarios;
 private Usuario seleccionarusuario;
    
  
     public UsuarioBean() {
         this.usuarios= new ArrayList();         
    }
     
        public List<Usuario> getUsuarios() {
        UsuarioDao usuarioDao=new UsuarioDaoImpl();
        this.usuarios=usuarioDao.findAll();
        return usuarios;
     }      
        
  

    public Usuario getSeleccionarusuario() {
        return seleccionarusuario;
    }

    public void setSeleccionarusuario(Usuario seleccionarusuario) {
        this.seleccionarusuario = seleccionarusuario;
    }
    
    public void btnCreateUsuario(ActionEvent actionEvent){
        
         UsuarioDao usuarioDao = new UsuarioDaoImpl();
        String msg;
        
        if (usuarioDao.create(this.seleccionarusuario)) {
            msg = "Se creo correctamente el registro.";
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
           FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            msg = "Error al crear el registro.";
        
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        
        }
    }
    
        public void btnUpdateUsuario(ActionEvent actionEvent){
             String msg;
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        if (usuarioDao.update(this.seleccionarusuario)) {
            msg = "Se modifico correctamente el registro.";            
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            msg = "Error al modificar el registro.";
        
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } 
    
    }
        
            public void btnDeleteUsuario(ActionEvent actionEvent){
                
                String msg;
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        if (usuarioDao.delete(this.seleccionarusuario.getIdUsuario())) {
            msg = "Se elimino correctamente el registro.";
           FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
           FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            msg = "Error al eliminar el registro.";
        
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
        
    }
    
    }
    
    


  
     

