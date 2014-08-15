/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Amistad;

import entidades.Auto.*;
import java.util.List;

/**
 *
 * @author andres
 */
public interface AmistadDAO {
    public void guardar(Amistad amistad);
    public void actualizar(Amistad amistad);
    public void borrar(Amistad amistad);
    public Amistad cargar(Integer amistad);
    public List<Amistad> listar();
    public List<Amistad> obtenerAmigos(int idUsuario);
}
