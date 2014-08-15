/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Solicitud;

import java.util.List;

/**
 *
 * @author andres
 */
public interface SolicitudDAO {
    public void guardar(Solicitud nuevo);
    public void actualizar(Solicitud nuevo);
    public void borrar(Solicitud nuevo);
    public Solicitud cargar(Integer nuevo);
    public List<Solicitud> listar();
}
