/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Auto;

import entidades.util.DAOFactory;
import java.util.List;

/**
 *
 * @author andres
 */
public class AutoRN {
    private AutoDAO user;
    public AutoRN(){
        this.user=DAOFactory.crearAutoDAO();
    }
    
    public void guardar(Auto usuario){
        this.user.guardar(usuario);
    }
    public void actualizar(Auto usuario){
        this.user.actualizar(usuario);
    }
    public void borrar(Auto usuario){
        this.user.borrar(usuario);
    }
    public Auto cargar(Integer idUsuario){
        return this.user.cargar(idUsuario);
    }
    public List<Auto> listar(){
        return this.user.listar();
    }
}
