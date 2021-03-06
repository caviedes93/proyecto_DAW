/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Ruta;

import entidades.Amistad.*;
import entidades.Auto.*;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author andres
 */
public class RutaDAOHibernate implements RutaDAO{
    private Session sesion;

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    @Override
    public void guardar(Ruta nuevo) {
        this.sesion.save(nuevo);
    }

    @Override
    public void actualizar(Ruta nuevo) {
        this.sesion.update(nuevo);
    }

    @Override
    public void borrar(Ruta nuevo) {
        this.sesion.delete(nuevo);
    }

    @Override
    public Ruta cargar(Integer idRuta) {
        return (Ruta)this.sesion.get(Ruta.class, idRuta);
    }

    @Override
    public List<Ruta> listar() {
        return this.sesion.createCriteria(Ruta.class).list();
    }
    
    public List<Ruta> obtenerRuta(String fecha){
        Criterion res= Restrictions.sqlRestriction("fecha='"+fecha+"'");
        Criteria criteria = this.sesion.createCriteria(Ruta.class);
        criteria.add(res);
        return criteria.list(); 
    }
}
