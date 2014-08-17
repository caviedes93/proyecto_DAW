/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.web;

import entidades.Noticia.Noticia;
import entidades.Noticia.NoticiaRN;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="noticiaBean")
@RequestScoped
public class NoticiaBean {
    private Noticia noticia;
    
    public String guardar(){
        FacesContext context = FacesContext.getCurrentInstance();
        NoticiaRN noticiaRN = new NoticiaRN();
		noticiaRN.guardar(this.noticia);
        return "guardar";
    }

    public Noticia getNoticia() {
        return noticia;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }
    
    public List<Noticia> noticiasGlobales(int idUsuario){
        NoticiaRN noticia = new NoticiaRN();
        return noticia.noticiaGlobales(idUsuario);
    }
    
    public List<Noticia> noticiaUsuario(int idUsuario){
        NoticiaRN noticia = new NoticiaRN();
        return noticia.noticiaUsuario(idUsuario);
    }
}
