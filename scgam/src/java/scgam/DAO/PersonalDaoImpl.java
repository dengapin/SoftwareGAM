/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scgam.DAO;

import org.apache.commons.codec.digest.DigestUtils;
import scgam.Interfaces.PersonalDao;
import scgam.model.Personal;
import org.hibernate.Session;
import scgam.util.HibernateUtil;

/**
 *
 * @author Robert
 */
public class PersonalDaoImpl implements PersonalDao {

    

    @Override
    public Personal findByPersonal(Personal personal) {
        Personal model = null;
            Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
            sesion.beginTransaction();
            String sql = "FROM Personal WHERE usuario ='" + personal.getUsuario() + "'";
        try{
            model = (Personal) sesion.createQuery(sql).uniqueResult();
            sesion.getTransaction().commit();
        } catch (Exception e) {
            sesion.beginTransaction().rollback();
        }
        return model;

    }



    @Override
    public Personal login(Personal personal) {
        String src;
        Personal model = this.findByPersonal(personal);
        src = DigestUtils.md2Hex(personal.getClave());
        if (model != null) {
            if (!src.equals(model.getClave())) {
                model = null;
            }
        }
        return model;
    }
    
    }
    
    
