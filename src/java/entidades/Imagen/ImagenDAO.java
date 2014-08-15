/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Imagen;

import entidades.Amistad.*;
import entidades.Auto.*;
import java.util.List;

/**
 *
 * @author andres
 */
public interface ImagenDAO {
    public void guardar(Imagen nuevo);
    public void actualizar(Imagen nuevo);
    public void borrar(Imagen nuevo);
    public Imagen cargar(Integer nuevo);
    public List<Imagen> listar();
}
