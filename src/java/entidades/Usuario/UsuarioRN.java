/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Usuario;

import entidades.util.DAOFactory;
import java.util.List;

/**
 *
 * @author andres
 */
public class UsuarioRN {
    private UsuarioDAO user;
    public UsuarioRN(){
        this.user=DAOFactory.crearUsuarioDAO();
    }
    
    public void guardar(Usuario usuario){
        this.user.guardar(usuario);
    }
    public void actualizar(Usuario usuario){
        this.user.actualizar(usuario);
    }
    public void borrar(Usuario usuario){
        this.user.borrar(usuario);
    }
    public Usuario cargar(Integer idUsuario){
        return this.user.cargar(idUsuario);
    }
    public List<Usuario> listar(){
        return this.user.listar();
    }
    
    public Usuario validarUsuario(String user, String pass){
        return this.user.validarUsuario(user, pass);
    }
    public boolean validaUsuario(String user, String pass){
        return this.user.validaUsuario(user, pass);
    }
}
