package scgam.beans;

import scgam.entities.Rolmenu;
import scgam.controllers.RolmenuFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "rolmenuController")
@ViewScoped
public class RolmenuController extends AbstractController<Rolmenu> implements Serializable {

    @EJB
    private RolmenuFacade ejbFacade;

    public RolmenuController() {
        super(Rolmenu.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
