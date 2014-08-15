/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.web;

import entidades.Noticia.Noticia;
import entidades.Noticia.NoticiaRN;
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
    
}
