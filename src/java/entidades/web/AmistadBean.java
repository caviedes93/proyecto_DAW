/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.web;

import entidades.Amistad.Amistad;
import entidades.Amistad.AmistadRN;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="amistadBean")
@RequestScoped
public class AmistadBean {
    private Amistad amistad;
    public Amistad getAmistad() {
        return amistad;
    }

    public void setAmistad(Amistad amistad) {
        this.amistad = amistad;
    }
    
    public List<Amistad> obtenerAmigos(int idUsuario){
        AmistadRN usuarioRN = new AmistadRN();
        return usuarioRN.obtenerAmigos(idUsuario);
    }
}
