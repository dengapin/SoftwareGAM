package Beans;

import entities.Rol;
import Controllers.RolFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "rolController")
@ViewScoped
public class RolController extends AbstractController<Rol> implements Serializable {

    @EJB
    private RolFacade ejbFacade;

    public RolController() {
        super(Rol.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
