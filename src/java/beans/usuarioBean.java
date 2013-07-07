/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.UsuarioDao;
import dao.UsuarioDaoImpl;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Usuario;

/**
 *
 * @author User
 */
public class usuarioBean {

    private List<Usuario> usuarios;  
    private Usuario selectedUsuario;
    public usuarioBean() {
        this.usuarios =new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        this.usuarios = usuarioDao.findAll();
        return usuarios;
    }

    public Usuario getSelectedUsuario() {
        return selectedUsuario;
    }

    public void setSelectedUsuario(Usuario selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }   
    
    
    public  void btnCreateUsuario(ActionEvent actionEvent) {
        
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        String msg;
        
        if (usuarioDao.create(this.selectedUsuario)) {
            
            msg = "Se creo correctamente el registro.";
            System.out.println(msg);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            msg = "Error al crear el registro.";
            System.out.println(msg);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
    public  void btnUpdateUsuario(ActionEvent actionEvent) {
        String msg;
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        if (usuarioDao.update(this.selectedUsuario)) {
            msg = "Se modifico correctamente el registro.";   
            System.out.println(msg);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            msg = "Error al modificar el registro.";
            System.out.println(msg);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }        
    }
    
    public  void btnDeleteUsuario(ActionEvent actionEvent) {
        String msg;
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        if (usuarioDao.delete(this.selectedUsuario.getIdUsuario())) {
            msg = "Se elimino correctamente el registro.";
            System.out.println(msg);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            msg = "Error al eliminar el registro.";
            System.out.println(msg);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
        
    }
}
