/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Usuario;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import funcionesWeb.serviciosWeb;

/**
 *
 * @author andres
 */
public class UsuarioDAOHibernate implements UsuarioDAO{
    private Session sesion;

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    @Override
    public void guardar(Usuario usuario) {
        this.sesion.save(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        this.sesion.update(usuario);
    }

    @Override
    public void borrar(Usuario usuario) {
        this.sesion.delete(usuario);
    }

    @Override
    public Usuario cargar(Integer idUsuario) {
        return (Usuario)this.sesion.get(Usuario.class, idUsuario);
    }

    @Override
    public List<Usuario> listar() {
        return this.sesion.createCriteria(Usuario.class).list();
    }

    @Override
    public Usuario obtenerUsuario(String user) {
        Criterion res= Restrictions.sqlRestriction("user='"+user+"'");
        Criteria criteria = this.sesion.createCriteria(Usuario.class);
        criteria.add(res);
        return (Usuario)criteria.uniqueResult();
        
    }

    @Override
    public boolean validaUsuario(String user, String pass) {
        serviciosWeb sw = new serviciosWeb();
        return (sw.autenticacion(user,pass));
    }
    
    
    
}
