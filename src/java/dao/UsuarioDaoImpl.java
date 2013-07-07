/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Usuario;
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
        try {
            String sql = "FROM Usuario WHERE usuario ='" + usuario.getCedula() + "'";
            model = (Usuario) sesion.createQuery(sql).uniqueResult();
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.printf("No se pudo hacer la consulta en la tabla Usuario");
            sesion.beginTransaction().rollback();
        }
        return model;

    }

    @Override
    public List<Usuario> findAll() {
        Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction(); 
        List L = null;
        try {
            L =  sesion.createQuery("FROM Usuario").list();
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Problema en la base");
            sesion.beginTransaction().rollback();
        }
        return L;
    }

    @Override
    public boolean create(Usuario user) {
        boolean flag;
        Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            sesion.beginTransaction(); 
            sesion.save(user);
            sesion.beginTransaction().commit();
            System.out.println("Se creo el usuario");
            flag = true;
        } catch (Exception e) {
            flag = false;
            System.out.println("No se creo el usuario, error: "+e.getMessage());
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
            System.out.println("Se actualizo el usuario");
            flag = true;
        } catch (Exception e) {
            flag = false;
            System.out.println("No se actualizo el usuario, error: "+e.getMessage());
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
            System.out.println("Se elimino el usuario");
            flag = true;
        } catch (Exception e) {
            flag = false;
            System.out.println("No se elimino el usuario, error: "+e.getMessage());
            sesion.beginTransaction().rollback();
        }
        return flag;
    }    
    
}
    
    
