package scgam.converters;

import scgam.entities.Representante;
import scgam.controllers.RepresentanteFacade;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;

@FacesConverter("representanteConverter")
public class RepresentanteConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0) {
            return null;
        }
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        Context ctx = null;
        RepresentanteFacade facade = null;
        try {
            ctx = new InitialContext();
        } catch (NamingException ex) {
            Logger.getLogger(RepresentanteConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ctx != null) {
            try {
                String lookupString;
                if (servletContext != null) {
                    lookupString = "java:global" + servletContext.getContextPath() + "/" + RepresentanteFacade.class.getSimpleName();
                } else {
                    lookupString = "java:global/" + RepresentanteFacade.class.getSimpleName();
                }
                facade = (RepresentanteFacade) ctx.lookup(lookupString);
            } catch (NamingException ex) {
                Logger.getLogger(RepresentanteConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (facade != null) {
            return facade.find(getKey(value));
        }
        return null;
    }

    java.lang.Integer getKey(String value) {
        java.lang.Integer key;
        key = Integer.valueOf(value);
        return key;
    }

    String getStringKey(java.lang.Integer value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value);
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Representante) {
            Representante o = (Representante) object;
            return getStringKey(o.getIdRepresentante());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Representante.class.getName()});
            return null;
        }
    }
}
