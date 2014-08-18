/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.web;

import entidades.Ruta.Ruta;
import entidades.Ruta.RutaRN;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author andres
 */
public class RutaBean {
    Ruta ruta = new Ruta();
    Date fecha=null;
    List<Ruta> lista=null;
    int validador = 1;
    
    public void obtenerRuta(){
        RutaRN nuevo = new RutaRN();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String result = df.format(this.fecha);
        System.out.println(result);
        this.lista= nuevo.obtenerRutas(result);
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getValidador() {
        return validador;
    }

    public void setValidador(int validador) {
        this.validador = validador;
    }

    public List<Ruta> getLista() {
        return lista;
    }

    public void setLista(List<Ruta> lista) {
        this.lista = lista;
    }
    

}
