/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Estado;

import entidades.Amistad.*;
import entidades.Auto.*;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author andres
 */
public class EstadoDAOHibernate implements EstadoDAO{
    private Session sesion;

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    @Override
    public void guardar(Estado nuevo) {
        this.sesion.save(nuevo);
    }

    @Override
    public void actualizar(Estado nuevo) {
        this.sesion.update(nuevo);
    }

    @Override
    public void borrar(Estado nuevo) {
        this.sesion.delete(nuevo);
    }

    @Override
    public Estado cargar(Integer idEstado) {
        return (Estado)this.sesion.get(Estado.class, idEstado);
    }

    @Override
    public List<Estado> listar() {
        return this.sesion.createCriteria(Estado.class).list();
    }
}
