package Beans;

import entities.Paseo;
import Controllers.PaseoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "paseoController")
@ViewScoped
public class PaseoController extends AbstractController<Paseo> implements Serializable {

    @EJB
    private PaseoFacade ejbFacade;

    public PaseoController() {
        super(Paseo.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
