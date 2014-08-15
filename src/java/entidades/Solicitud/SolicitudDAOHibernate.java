/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Solicitud;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author andres
 */
public class SolicitudDAOHibernate implements SolicitudDAO{
    private Session sesion;

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }

    @Override
    public void guardar(Solicitud nuevo) {
        this.sesion.save(nuevo);
    }

    @Override
    public void actualizar(Solicitud nuevo) {
        this.sesion.update(nuevo);
    }

    @Override
    public void borrar(Solicitud nuevo) {
        this.sesion.delete(nuevo);
    }

    @Override
    public Solicitud cargar(Integer idComentario) {
        return (Solicitud)this.sesion.get(Solicitud.class, idComentario);
    }

    @Override
    public List<Solicitud> listar() {
        return this.sesion.createCriteria(Solicitud.class).list();
    }
}
