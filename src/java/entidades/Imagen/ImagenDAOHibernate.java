/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Imagen;

import entidades.Amistad.*;
import entidades.Auto.*;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author andres
 */
public class ImagenDAOHibernate implements ImagenDAO{
    private Session sesion;

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    @Override
    public void guardar(Imagen nuevo) {
        this.sesion.save(nuevo);
    }

    @Override
    public void actualizar(Imagen nuevo) {
        this.sesion.update(nuevo);
    }

    @Override
    public void borrar(Imagen nuevo) {
        this.sesion.delete(nuevo);
    }

    @Override
    public Imagen cargar(Integer idImagen) {
        return (Imagen)this.sesion.get(Imagen.class, idImagen);
    }

    @Override
    public List<Imagen> listar() {
        return this.sesion.createCriteria(Imagen.class).list();
    }
}
