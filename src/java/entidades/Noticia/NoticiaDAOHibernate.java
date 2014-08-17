/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Noticia;

import entidades.Amistad.Amistad;
import entidades.Amistad.AmistadRN;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author andres
 */
public class NoticiaDAOHibernate implements NoticiaDAO{
    private Session sesion;

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    @Override
    public void guardar(Noticia nuevo) {
        this.sesion.save(nuevo);
    }

    @Override
    public void actualizar(Noticia nuevo) {
        this.sesion.update(nuevo);
    }

    @Override
    public void borrar(Noticia nuevo) {
        this.sesion.delete(nuevo);
    }

    @Override
    public Noticia cargar(Integer idNoticia) {
        return (Noticia)this.sesion.get(Noticia.class, idNoticia);
    }

    @Override
    public List<Noticia> noticiaUsuario(int idUsuario) {
        Criterion res= Restrictions.sqlRestriction("idUsuario='"+idUsuario+"'");
        Criteria criteria = this.sesion.createCriteria(Noticia.class);
        criteria.add(res);
        criteria.addOrder(Order.desc("fecha"));
        return criteria.list();
    }

    @Override
    public List<Noticia> noticiaGlobales(int idUsuario) {
        AmistadRN amistad = new AmistadRN();
        List<Amistad> lista= amistad.obtenerAmigos(idUsuario);
        String query = "";
        for(Amistad a: lista){
            if(query==""){
                query ="idUsuario="+idUsuario+" or idUsuario="+a.getUsuarioByUser2().getIdUsuario();
            }else{
                query = query+" or idUsuario="+a.getUsuarioByUser2().getIdUsuario();
            }            
        }
        Criterion res= Restrictions.sqlRestriction(query);
        Criteria criteria = this.sesion.createCriteria(Noticia.class);
        criteria.add(res);
        criteria.addOrder(Order.desc("fecha"));
        return criteria.list();
    }
}
