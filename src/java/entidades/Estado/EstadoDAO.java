/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Estado;

import entidades.Amistad.*;
import entidades.Auto.*;
import java.util.List;

/**
 *
 * @author andres
 */
public interface EstadoDAO {
    public void guardar(Estado nuevo);
    public void actualizar(Estado nuevo);
    public void borrar(Estado nuevo);
    public Estado cargar(Integer nuevo);
    public List<Estado> listar();
}
