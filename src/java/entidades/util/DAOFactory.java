/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.util;

import entidades.Amistad.*;
import entidades.Auto.*;
import entidades.Comentario.ComentarioDAO;
import entidades.Comentario.ComentarioDAOHibernate;
import entidades.Estado.EstadoDAO;
import entidades.Estado.EstadoDAOHibernate;
import entidades.Imagen.ImagenDAO;
import entidades.Imagen.ImagenDAOHibernate;
import entidades.Noticia.NoticiaDAO;
import entidades.Noticia.NoticiaDAOHibernate;
import entidades.Ruta.RutaDAO;
import entidades.Ruta.RutaDAOHibernate;
import entidades.Solicitud.SolicitudDAO;
import entidades.Solicitud.SolicitudDAOHibernate;
import entidades.Usuario.*;


/**
 *
 * @author andres
 */
public class DAOFactory {
    
    public static AmistadDAO crearAmistadDAO(){
        AmistadDAOHibernate nuevo = new AmistadDAOHibernate();
        nuevo.setSesion(HibernateUtil.getSessionFactory().openSession());
        return nuevo;
    }
    
    public static AutoDAO crearAutoDAO(){
        AutoDAOHibernate autoDAO = new AutoDAOHibernate();
        autoDAO.setSesion(HibernateUtil.getSessionFactory().openSession());
        return autoDAO;
    }
    
    public static EstadoDAO crearEstadoDAO(){
        EstadoDAOHibernate nuevo = new EstadoDAOHibernate();
        nuevo.setSesion(HibernateUtil.getSessionFactory().openSession());
        return nuevo;
    }
    
    public static ImagenDAO crearImagenDAO(){
        ImagenDAOHibernate nuevo = new ImagenDAOHibernate();
        nuevo.setSesion(HibernateUtil.getSessionFactory().openSession());
        return nuevo;
    }
    
    public static RutaDAO crearRutaDAO(){
        RutaDAOHibernate nuevo = new RutaDAOHibernate();
        nuevo.setSesion(HibernateUtil.getSessionFactory().openSession());
        return nuevo;
    }
    
    public static UsuarioDAO crearUsuarioDAO(){
        UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
        usuarioDAO.setSesion(HibernateUtil.getSessionFactory().openSession());
        return usuarioDAO;
    }
    
    public static ComentarioDAO crearComentarioDAO(){
        ComentarioDAOHibernate ComentarioDAO = new ComentarioDAOHibernate();
        ComentarioDAO.setSesion(HibernateUtil.getSessionFactory().openSession());
        return ComentarioDAO;
    }
    
    public static NoticiaDAO crearNoticiaDAO(){
        NoticiaDAOHibernate NoticiaDAO = new NoticiaDAOHibernate();
        NoticiaDAO.setSesion(HibernateUtil.getSessionFactory().openSession());
        return NoticiaDAO;
    }
    
    public static SolicitudDAO crearSolicitudDAO(){
        SolicitudDAOHibernate SolicitudDAO = new SolicitudDAOHibernate();
        SolicitudDAO.setSesion(HibernateUtil.getSessionFactory().openSession());
        return SolicitudDAO;
    }
    
}
