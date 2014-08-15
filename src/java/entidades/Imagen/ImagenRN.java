/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Imagen;

import entidades.Amistad.*;
import entidades.Auto.*;
import entidades.util.DAOFactory;
import java.util.List;

/**
 *
 * @author andres
 */
public class ImagenRN {
    private ImagenDAO user;
    public ImagenRN(){
        this.user=DAOFactory.crearImagenDAO();
    }
    
    public void guardar(Imagen usuario){
        this.user.guardar(usuario);
    }
    public void actualizar(Imagen usuario){
        this.user.actualizar(usuario);
    }
    public void borrar(Imagen usuario){
        this.user.borrar(usuario);
    }
    public Imagen cargar(Integer idImagen){
        return this.user.cargar(idImagen);
    }
    public List<Imagen> listar(){
        return this.user.listar();
    }
}
