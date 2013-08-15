package Beans;

import entities.Representante;
import Controllers.RepresentanteFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "representanteController")
@ViewScoped
public class RepresentanteController extends AbstractController<Representante> implements Serializable {

    @EJB
    private RepresentanteFacade ejbFacade;

    public RepresentanteController() {
        super(Representante.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
