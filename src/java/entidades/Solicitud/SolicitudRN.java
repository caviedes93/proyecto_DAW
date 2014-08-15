/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Solicitud;

import entidades.util.DAOFactory;
import java.util.List;

/**
 *
 * @author andres
 */
public class SolicitudRN {
    private SolicitudDAO nuevo;
    public SolicitudRN(){
        this.nuevo=DAOFactory.crearSolicitudDAO();
    }
    
    public void guardar(Solicitud nuevo){
        this.nuevo.guardar(nuevo);
    }
    public void actualizar(Solicitud nuevo){
        this.nuevo.actualizar(nuevo);
    }
    public void borrar(Solicitud nuevo){
        this.nuevo.borrar(nuevo);
    }
    public Solicitud cargar(Integer idComentario){
        return this.nuevo.cargar(idComentario);
    }
    public List<Solicitud> listar(){
        return this.nuevo.listar();
    }
}
