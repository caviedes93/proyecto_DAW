/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Usuario;

import entidades.Comentario.Comentario;
import entidades.Comentario.ComentarioRN;
import entidades.Noticia.Noticia;
import entidades.Noticia.NoticiaRN;
import entidades.Ruta.Ruta;
import entidades.Ruta.RutaRN;
import java.util.List;

/**
 *
 * @author andres
 */
public class mian {
    public static void main(String[] args){
        RutaRN user=new RutaRN();
        
        List<Ruta> lista = user.obtenerRutas("1");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        //System.out.println(user.listar());
    }
}
