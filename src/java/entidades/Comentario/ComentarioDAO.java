/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Comentario;

import java.util.List;

/**
 *
 * @author andres
 */
public interface ComentarioDAO {
    public void guardar(Comentario nuevo);
    public void actualizar(Comentario nuevo);
    public void borrar(Comentario nuevo);
    public Comentario cargar(Integer nuevo);
    public List<Comentario> listar();
}
