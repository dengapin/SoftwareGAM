/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelos.Usuario;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Dennise
 */
public class UsuarioDaoImpl implements UsuarioDao {

    @Override
    public Usuario findByUsuario(Usuario usuario) {
        Usuario model = null;

        
            Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
            sesion.beginTransaction();
            String sql = "FROM Usuario WHERE usuario ='" + usuario.getCedula()+ "'";
            try {
            model = (Usuario) sesion.createQuery(sql).uniqueResult();
            sesion.beginTransaction().commit();
        } catch (Exception e) {
            sesion.beginTransaction().rollback();
           
        }
        return model;

    }

    @Override
    public List<Usuario> findAll() {

        List Lista = null;
     

            Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
            sesion.beginTransaction();  
            Lista =  sesion.createQuery("FROM Usuario").list();
               try {
            sesion.beginTransaction().commit();
        } catch (Exception e) {
            System.out.println("Problema en la base");
            sesion.beginTransaction().rollback();
        }
        return Lista;
    }

    @Override
    public boolean create(Usuario user) {
        boolean flag;
        Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            sesion.beginTransaction(); 
            sesion.save(user);
            sesion.beginTransaction().commit();
            flag = true;
        } catch (Exception e) {
            flag = false;
            sesion.beginTransaction().rollback();
        }
        return flag;
    }

    @Override
    public boolean update(Usuario user) {
         boolean flag;
         Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            sesion.beginTransaction();
            //autoicrementable
            Usuario usuariodb = (Usuario) sesion.load(Usuario.class, user.getIdUsuario());
            usuariodb.setNombres(user.getNombres());
            usuariodb.setApellidos(user.getApellidos());
            usuariodb.setCodigo(user.getCodigo());
            usuariodb.setGrupo(user.getGrupo());
            usuariodb.setTelefono(user.getTelefono());
            usuariodb.setCedula(user.getCedula());
            usuariodb.setEdad(user.getEdad());
            usuariodb.setCorreo(user.getCorreo());
            usuariodb.setSexo(user.getSexo());
            usuariodb.setTipoSangre(user.getTipoSangre());
            usuariodb.setDireccion(user.getDireccion());
            usuariodb.setProfesion(user.getProfesion());
            usuariodb.setConvivencia(user.getConvivencia());
            usuariodb.setPatologia(user.getPatologia());
            usuariodb.setAlergia(user.getAlergia());
            usuariodb.setInstruccion(user.getInstruccion());
            usuariodb.setLicencia(user.isLicencia());
            usuariodb.setHijos(user.getHijos());
            usuariodb.setObservaciones(user.getObservaciones());
            sesion.update(usuariodb);
            sesion.beginTransaction().commit();
            flag = true;
        } catch (Exception e) {
            flag = false;
            sesion.beginTransaction().rollback();
        }
        return flag;
    }

    @Override
    public boolean delete(Integer id) {
         boolean flag;
         Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        try {            
            sesion.beginTransaction();
            Usuario u = (Usuario) sesion.load(Usuario.class, id);
            sesion.delete(u);
            sesion.beginTransaction().commit();
            flag = true;
        } catch (Exception e) {
            flag = false;
            sesion.beginTransaction().rollback();
        }
        return flag;
    }    
    
}
    
    
