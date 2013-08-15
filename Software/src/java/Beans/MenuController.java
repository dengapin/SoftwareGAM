package Beans;

import entities.Menu;
import Controllers.MenuFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "menuController")
@ViewScoped
public class MenuController extends AbstractController<Menu> implements Serializable {

    @EJB
    private MenuFacade ejbFacade;

    public MenuController() {
        super(Menu.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
