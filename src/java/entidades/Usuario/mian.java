/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.Usuario;

import entidades.Amistad.Amistad;
import entidades.Amistad.AmistadRN;
import entidades.Auto.Auto;
import entidades.Auto.AutoRN;
import java.util.List;

/**
 *
 * @author andres
 */
public class mian {
    public static void main(String[] args){
        AmistadRN user=new AmistadRN();
        
        List<Amistad> lista = user.obtenerAmigos(1);
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        //System.out.println(user.listar());
    }
}
