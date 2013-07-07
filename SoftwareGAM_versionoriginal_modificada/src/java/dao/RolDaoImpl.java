/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelos.Rol;

import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Dennise
 */
public class RolDaoImpl implements RolDao {

   
    @Override
    public Rol findByRol(Rol rol) {
        Rol model = null;

        
            Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
            sesion.beginTransaction();
            String sql = "FROM Rol WHERE rol ='" + rol.getIdRol()+ "'";
            try {
            model = (Rol) sesion.createQuery(sql).uniqueResult();
            sesion.beginTransaction().commit();
        } catch (Exception e) {
            sesion.beginTransaction().rollback();
           
        }
        return model;

    }

     public List<Rol> findAll() {

        List Lista = null;
     

            Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
            sesion.beginTransaction();  
            Lista =  sesion.createQuery("FROM Rol").list();
               try {
            sesion.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("Problema en la base");
            sesion.beginTransaction().rollback();
        }
        return Lista;
    }

 

}