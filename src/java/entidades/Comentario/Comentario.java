package entidades.Comentario;
// Generated 13-ago-2014 2:25:45 by Hibernate Tools 3.6.0


import entidades.Noticia.Noticia;
import entidades.Usuario.Usuario;

/**
 * Comentario generated by hbm2java
 */
public class Comentario  implements java.io.Serializable {


     private Integer idComentario;
     private Noticia noticia;
     private Usuario usuario;
     private String descripcion;

    public Comentario() {
    }

    public Comentario(Noticia noticia, Usuario usuario,String descripcion) {
       this.noticia = noticia;
       this.usuario = usuario;
       this.descripcion = descripcion;
    }
   
    public Integer getIdComentario() {
        return this.idComentario;
    }
    
    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }
    public Noticia getNoticia() {
        return this.noticia;
    }
    
    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Comentario{" + "idComentario=" + idComentario + ", descripcion=" + descripcion + '}';
    }

}
