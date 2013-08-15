package beans;

import entities.Vehiculo;
import controllers.VehiculoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "vehiculoController")
@ViewScoped
public class VehiculoController extends AbstractController<Vehiculo> implements Serializable {

    @EJB
    private VehiculoFacade ejbFacade;

    public VehiculoController() {
        super(Vehiculo.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
