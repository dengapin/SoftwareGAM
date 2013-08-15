package Beans;

import entities.Personal;
import Controllers.PersonalFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "personalController")
@ViewScoped
public class PersonalController extends AbstractController<Personal> implements Serializable {

    @EJB
    private PersonalFacade ejbFacade;

    public PersonalController() {
        super(Personal.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
