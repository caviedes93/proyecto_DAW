/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Auto;

import java.util.List;

/**
 *
 * @author andres
 */
public interface AutoDAO {
    public void guardar(Auto auto);
    public void actualizar(Auto auto);
    public void borrar(Auto auto);
    public Auto cargar(Integer auto);
    public List<Auto> listar();
}
