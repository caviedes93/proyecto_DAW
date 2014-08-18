/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Ruta;

import entidades.Amistad.*;
import entidades.Auto.*;
import entidades.util.DAOFactory;
import java.util.List;

/**
 *
 * @author andres
 */
public class RutaRN {
    private RutaDAO user;
    public RutaRN(){
        this.user=DAOFactory.crearRutaDAO();
    }
    
    public void guardar(Ruta usuario){
        this.user.guardar(usuario);
    }
    public void actualizar(Ruta usuario){
        this.user.actualizar(usuario);
    }
    public void borrar(Ruta usuario){
        this.user.borrar(usuario);
    }
    public Ruta cargar(Integer idRuta){
        return this.user.cargar(idRuta);
    }
    public List<Ruta> listar(){
        return this.user.listar();
    }
    
    public List<Ruta> obtenerRutas(String fecha){
        return this.user.obtenerRuta(fecha);
    }
}
