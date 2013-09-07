package scgam.beans;

import scgam.entities.Conductor;
import scgam.controllers.ConductorFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "conductorController")
@ViewScoped
public class ConductorController extends AbstractController<Conductor> implements Serializable {

    @EJB
    private ConductorFacade ejbFacade;

    public ConductorController() {
        super(Conductor.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
