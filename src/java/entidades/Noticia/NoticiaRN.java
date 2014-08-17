/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Noticia;

import entidades.util.DAOFactory;
import java.util.List;

/**
 *
 * @author andres
 */
public class NoticiaRN {
    private NoticiaDAO nuevo;
    public NoticiaRN(){
        this.nuevo=DAOFactory.crearNoticiaDAO();
    }
    
    public void guardar(Noticia nuevo){
        this.nuevo.guardar(nuevo);
    }
    public void actualizar(Noticia nuevo){
        this.nuevo.actualizar(nuevo);
    }
    public void borrar(Noticia nuevo){
        this.nuevo.borrar(nuevo);
    }
    public Noticia cargar(Integer idComentario){
        return this.nuevo.cargar(idComentario);
    }
    public List<Noticia> noticiaUsuario(int idUsuario){
        return this.nuevo.noticiaUsuario(idUsuario);
    }
    
    public List<Noticia> noticiaGlobales(int idUsuario){
        return this.nuevo.noticiaGlobales(idUsuario);
    }
}
