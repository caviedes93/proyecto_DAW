/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Noticia;

import java.util.List;

/**
 *
 * @author andres
 */
public interface NoticiaDAO {
    public void guardar(Noticia nuevo);
    public void actualizar(Noticia nuevo);
    public void borrar(Noticia nuevo);
    public Noticia cargar(Integer nuevo);
    public List<Noticia> noticiaUsuario(int idUsuario);
    public List<Noticia> noticiaGlobales(int idUsuario);
}
