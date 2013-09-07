package scgam.beans;

import scgam.entities.Asistencia;
import scgam.controllers.AsistenciaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "asistenciaController")
@ViewScoped
public class AsistenciaController extends AbstractController<Asistencia> implements Serializable {

    @EJB
    private AsistenciaFacade ejbFacade;

    public AsistenciaController() {
        super(Asistencia.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
