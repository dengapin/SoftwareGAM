package scgam.converters;

import scgam.entities.Menu;
import scgam.controllers.MenuFacade;
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

@FacesConverter("menuConverter")
public class MenuConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0) {
            return null;
        }
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        Context ctx = null;
        MenuFacade facade = null;
        try {
            ctx = new InitialContext();
        } catch (NamingException ex) {
            Logger.getLogger(MenuConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ctx != null) {
            try {
                String lookupString;
                if (servletContext != null) {
                    lookupString = "java:global" + servletContext.getContextPath() + "/" + MenuFacade.class.getSimpleName();
                } else {
                    lookupString = "java:global/" + MenuFacade.class.getSimpleName();
                }
                facade = (MenuFacade) ctx.lookup(lookupString);
            } catch (NamingException ex) {
                Logger.getLogger(MenuConverter.class.getName()).log(Level.SEVERE, null, ex);
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
        if (object instanceof Menu) {
            Menu o = (Menu) object;
            return getStringKey(o.getIdMenu());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Menu.class.getName()});
            return null;
        }
    }
}
