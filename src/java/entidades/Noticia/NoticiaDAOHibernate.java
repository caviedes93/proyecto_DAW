/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Noticia;

import java.util.List;
import org.hibernate.Session;

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
    public List<Noticia> listar() {
        return this.sesion.createCriteria(Noticia.class).list();
    }
}
