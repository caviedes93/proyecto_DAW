/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.web;

import entidades.Usuario.*;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="clienteBean")
@RequestScoped
public class UsuarioBean {
    private Usuario usuario = new Usuario();
    private String user;
    private String pass;
    
    public String guardar(){
        UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.guardar(this.usuario);
        return "guardar";
    }
    
    public Usuario obtenerDatos(int id){
        UsuarioRN usuarioRN = new UsuarioRN();
        return  usuarioRN.cargar(id);

    }
    
    public String validar(){
        UsuarioRN usuarioRN = new UsuarioRN();        
        boolean validacion= usuarioRN.validaUsuario(this.user, this.pass);
        if(validacion){
            this.usuario=usuarioRN.obtenerUsuario(this.user);
            return "exito";
        }else
            return "error";
    }
    
    public int obtenerIdUsuario(String user){
        return 1;
    }
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
   
}
