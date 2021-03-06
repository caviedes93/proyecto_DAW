/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Comentario;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author andres
 */
public class ComentarioDAOHibernate implements ComentarioDAO{
    private Session sesion;

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    @Override
    public void guardar(Comentario nuevo) {
        this.sesion.save(nuevo);
    }

    @Override
    public void actualizar(Comentario nuevo) {
        this.sesion.update(nuevo);
    }

    @Override
    public void borrar(Comentario nuevo) {
        this.sesion.delete(nuevo);
    }

    @Override
    public Comentario cargar(Integer idComentario) {
        return (Comentario)this.sesion.get(Comentario.class, idComentario);
    }

    @Override
    public List<Comentario> listar() {
        return this.sesion.createCriteria(Comentario.class).list();
    }

    @Override
    public List<Comentario> obtenerComentarios(int idNoticia) {
        Criterion res= Restrictions.sqlRestriction("idNoticia='"+idNoticia+"'");
        Criteria criteria = this.sesion.createCriteria(Comentario.class);
        criteria.add(res);
        return criteria.list();
    }
    
}
