/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Amistad;

import entidades.Auto.*;
import entidades.Usuario.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author andres
 */
public class AmistadDAOHibernate implements AmistadDAO{
    private Session sesion;

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    @Override
    public void guardar(Amistad amistad) {
        this.sesion.save(amistad);
    }

    @Override
    public void actualizar(Amistad amistad) {
        this.sesion.update(amistad);
    }

    @Override
    public void borrar(Amistad amistad) {
        this.sesion.delete(amistad);
    }

    @Override
    public Amistad cargar(Integer idAmistad) {
        return (Amistad)this.sesion.get(Amistad.class, idAmistad);
    }

    @Override
    public List<Amistad> listar() {
        return this.sesion.createCriteria(Amistad.class).list();
    }
    
    @Override
    public List<Amistad> obtenerAmigos(int idUsuario){
        Criterion res= Restrictions.sqlRestriction("user1='"+idUsuario+"'");
        Criteria criteria = this.sesion.createCriteria(Amistad.class);
        criteria.add(res);
        return criteria.list();        
    }

}
