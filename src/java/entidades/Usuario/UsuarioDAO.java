/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Usuario;

import java.util.List;

/**
 *
 * @author andres
 */
public interface UsuarioDAO {
    
    public void guardar(Usuario usuario);
    public void actualizar(Usuario usuario);
    public void borrar(Usuario usuario);
    public Usuario cargar(Integer idUsuario);
    public List<Usuario> listar();
    public Usuario obtenerUsuario(String user);
    public boolean validaUsuario(String user, String pass);
}
