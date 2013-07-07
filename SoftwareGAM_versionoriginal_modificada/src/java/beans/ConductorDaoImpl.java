/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.*;
import modelos.Conductor;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Dennise
 */
public class ConductorDaoImpl implements ConductorDao{

    @Override
    public Conductor findByConductor(Conductor conductor) {
    Conductor model=null;
    Session sesion=HibernateUtil.getSessionFactory().getCurrentSession();
   String sql="FROM Conductor WHERE nombres ='"+conductor.getNombres()+"'";
    try{
   sesion.beginTransaction();
   model= (Conductor)sesion.createQuery(sql).uniqueResult();
   sesion.beginTransaction().commit();
   }catch(Exception e){
   sesion.beginTransaction().rollback();
   }
   return model;
   }

  
    
}
