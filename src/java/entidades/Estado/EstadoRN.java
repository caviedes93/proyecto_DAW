/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Estado;

import entidades.Amistad.*;
import entidades.Auto.*;
import entidades.util.DAOFactory;
import java.util.List;

/**
 *
 * @author andres
 */
public class EstadoRN {
    private EstadoDAO user;
    public EstadoRN(){
        this.user=DAOFactory.crearEstadoDAO();
    }
    
    public void guardar(Estado nuevo){
        this.user.guardar(nuevo);
    }
    public void actualizar(Estado nuevo){
        this.user.actualizar(nuevo);
    }
    public void borrar(Estado nuevo){
        this.user.borrar(nuevo);
    }
    public Estado cargar(Integer idEstado){
        return this.user.cargar(idEstado);
    }
    public List<Estado> listar(){
        return this.user.listar();
    }
}
