/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.web;

import entidades.Comentario.Comentario;
import entidades.Comentario.ComentarioRN;
import java.util.List;

/**
 *
 * @author andres
 */
public class ComentarioBean {
    private Comentario comentario;

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }
    
    public List<Comentario> obtenerComentarios(int idComentario){
        ComentarioRN comentarioRN = new ComentarioRN();
        return comentarioRN.obtenerComentarios(idComentario);
    }
}
