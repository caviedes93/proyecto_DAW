/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Comentario;

import entidades.util.DAOFactory;
import java.util.List;

/**
 *
 * @author andres
 */
public class ComentarioRN {
    private ComentarioDAO nuevo;
    public ComentarioRN(){
        this.nuevo=DAOFactory.crearComentarioDAO();
    }
    
    public void guardar(Comentario nuevo){
        this.nuevo.guardar(nuevo);
    }
    public void actualizar(Comentario nuevo){
        this.nuevo.actualizar(nuevo);
    }
    public void borrar(Comentario nuevo){
        this.nuevo.borrar(nuevo);
    }
    public Comentario cargar(Integer idComentario){
        return this.nuevo.cargar(idComentario);
    }
    public List<Comentario> listar(){
        return this.nuevo.listar();
    }
}
