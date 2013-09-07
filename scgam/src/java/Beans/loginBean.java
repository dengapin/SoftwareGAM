/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import scgam.Interfaces.PersonalDao;
import scgam.DAO.PersonalDaoImpl;
import java.awt.event.ActionEvent;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import scgam.model.Personal;
import org.primefaces.context.RequestContext;
import scgam.util.MyUtil;

/**
 * Título: loginBean Descripción: Esta Clase nos permite consultar la tabla
 * personal de la base de datos para verificar si encuentra el usuario y clave
 * ingresado en la interfaz grafica Copyright: Copyright (c) 2013. Este archivo
 * se fue desarrollado para el curso de Software II.
 * @author Roberto Pico Mejia, Dennise Pintado Lindao.
 * @version 0.1
 */
@Named(value = "loginBean")
@SessionScoped
public class loginBean implements Serializable {

    /**
     * Variable de tipo Personal y PersonalDao
     */
    private Personal personal;
    private PersonalDao personaldao;

    /**
     * Constructor por defecto
     */
    public loginBean() {
        this.personaldao = new PersonalDaoImpl();
        if (this.personal == null) {
            this.personal = new Personal();
        }
    }

    /**
     * Getter del atributo personal
     */
    public Personal getPersonal() {
        return personal;
    }

    /**
     * Setter del atributo Personal
     */
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    /**
 * Metodo que verifica si usuario y clave ingresados
 * se encuentran en la base de datos.
 * @param ActionEvent actionEvent
 * @author  Roberto Pico
 * @return void
 */
    public void login(ActionEvent actionEvent) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg = null;
        boolean loggedIn;
        String ruta = "";
        this.personal = this.personaldao.login(this.personal);
        if (this.personal != null) {
            loggedIn = true;
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.personal.getUsuario());
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", this.personal.getNombre());
            if (personal.getUsaurioModificacion().equals("Administrador")|| personal.getUsaurioModificacion().equals("Desarrollador")) {
                ruta = MyUtil.basepathlogin() + "index.xhtml";
            } else {
                ruta = MyUtil.basepathlogin() + "user/index.xhtml";
            }
           
        } else {
            loggedIn = false;
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Usuario Incorrecto");

            if (this.personal == null) {
                this.personal = new Personal();
            }
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
        context.addCallbackParam("loggedIn", loggedIn);
        context.addCallbackParam("ruta", ruta);
    }

//    public String loginOut() {
//        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
//        return MyUtil.basepathlogin() + "login.xhtml";
//    }
}
