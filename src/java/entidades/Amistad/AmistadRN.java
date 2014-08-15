/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Amistad;

import entidades.Auto.*;
import entidades.util.DAOFactory;
import java.util.List;

/**
 *
 * @author andres
 */
public class AmistadRN {
    private AmistadDAO nuevo;
    public AmistadRN(){
        this.nuevo=DAOFactory.crearAmistadDAO();
    }
    
    public void guardar(Amistad usuario){
        this.nuevo.guardar(usuario);
    }
    public void actualizar(Amistad usuario){
        this.nuevo.actualizar(usuario);
    }
    public void borrar(Amistad usuario){
        this.nuevo.borrar(usuario);
    }
    public Amistad cargar(Integer idAmistad){
        return this.nuevo.cargar(idAmistad);
    }
    public List<Amistad> listar(){
        return this.nuevo.listar();
    }
    
    public List<Amistad> obtenerAmigos(int idUsuario){
        return this.nuevo.obtenerAmigos(idUsuario);
    }
}
