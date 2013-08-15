/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaces.PersonalDao;
import model.Personal;
import org.hibernate.Session;
import util.HibernateUtil;

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

//    @Override
//    public List<Personal> findAll() {
//        Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
//        sesion.beginTransaction();
//        List L = null;
//        try {
//              
//            L =  sesion.createQuery("FROM Personal").list();
//            sesion.beginTransaction().commit();
//        } catch (Exception e) {
//            System.out.println("Problema en la base");
//            sesion.beginTransaction().rollback();
//        }
//        return L;
//    }

    @Override
    public Personal login(Personal personal) {
        Personal model = this.findByPersonal(personal);
        if (model != null) {
            if (!personal.getClave().equals(model.getClave())) {
                model = null;
            }
        }
        return model;
    }
    
    }
    
    
