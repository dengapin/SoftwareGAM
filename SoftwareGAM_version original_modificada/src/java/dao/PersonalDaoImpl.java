/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelos.Personal;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Dennise
 */
public class PersonalDaoImpl implements PersonalDao{

    @Override
    public Personal findByPersonal(Personal personal) {
    Personal model=null;
    Session sesion=HibernateUtil.getSessionFactory().getCurrentSession();
   String sql="FROM Personal WHERE usuario ='"+personal.getUsuario()+"'";
    try{
   sesion.beginTransaction();
   model= (Personal)sesion.createQuery(sql).uniqueResult();
   sesion.beginTransaction().commit();
   }catch(Exception e){
   sesion.beginTransaction().rollback();
   }
   return model;
   }

    @Override
    public Personal login(Personal personal) {
       Personal model= this.findByPersonal(personal);
       if(model != null){
       if(!personal.getClave().equals(model.getClave())){
       model=null;
       }
       }
        return model;
    }
    
}
