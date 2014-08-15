/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Ruta;

import entidades.Amistad.*;
import entidades.Auto.*;
import java.util.List;

/**
 *
 * @author andres
 */
public interface RutaDAO {
    public void guardar(Ruta nuevo);
    public void actualizar(Ruta nuevo);
    public void borrar(Ruta nuevo);
    public Ruta cargar(Integer nuevo);
    public List<Ruta> listar();
}
