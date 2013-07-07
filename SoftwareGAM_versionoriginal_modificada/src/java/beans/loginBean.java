/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.PersonalDao;
import dao.PersonalDaoImpl;
import java.awt.event.ActionEvent;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelos.Personal;
import org.primefaces.context.RequestContext;
import util.MyUtil;

/**
 *
 * @author Dennise
 */
@Named(value = "loginBean")
@SessionScoped
public class loginBean implements Serializable {

 
    private Personal personal;
    private PersonalDao personaldao;
    public loginBean(){
    this.personaldao=new PersonalDaoImpl();
    if(this.personal==null){
    this.personal=new Personal();
    }
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
      
    
    public void login(ActionEvent actionEvent) {  
        RequestContext context = RequestContext.getCurrentInstance();  
        FacesMessage msg = null;  
        boolean loggedIn;
        String ruta="";
          this.personal= this.personaldao.login(this.personal);
        if(this.personal !=null) {  
            loggedIn = true;  
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.personal.getUsuario());
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido",this.personal.getUsuario());  
            ruta= MyUtil.basepathlogin()+"views/inicio.xhtml";
        } else {  
            loggedIn = false;  
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");  
          if(this.personal==null){
          this.personal=new Personal();
    }
        }  
          
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        context.addCallbackParam("loggedIn", loggedIn);  
        context.addCallbackParam("ruta",ruta);
    }  
    
    public void logout(){
    String ruta= MyUtil.basepathlogin()+"login.xhtml";
    RequestContext context = RequestContext.getCurrentInstance();
    FacesContext facesContext= FacesContext.getCurrentInstance();
    
    HttpSession sesion = (HttpSession) facesContext.getExternalContext().getSession(false);
    sesion.invalidate();
    
    context.addCallbackParam("loggedOut", true);
    context.addCallbackParam("ruta", ruta);
    }
}  

