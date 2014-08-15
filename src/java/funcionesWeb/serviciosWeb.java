/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funcionesWeb;

import org.tempuri.WsInfoEstudianteGeneralResponse;
import org.tempuri.WsInfoEstudianteResponse;

/**
 *
 * @author Luis Vasquez
 */
public class serviciosWeb {
   public static void main(String[] args){
       System.out.println(wsInfoEstudiante("201103823"));
   
   }
    
    public static boolean autenticacion(java.lang.String authUser, java.lang.String authContrasenia) {
        org.tempuri.Wsandroid service = new org.tempuri.Wsandroid();
        org.tempuri.WsandroidSoap port = service.getWsandroidSoap();
        return port.autenticacion(authUser, authContrasenia);
    }

    private static WsInfoEstudianteResponse.WsInfoEstudianteResult wsInfoEstudiante(java.lang.String codigoEstudiante) {
        org.tempuri.Wsandroid service = new org.tempuri.Wsandroid();
        org.tempuri.WsandroidSoap port = service.getWsandroidSoap();
        return port.wsInfoEstudiante(codigoEstudiante);
    }

    private static WsInfoEstudianteGeneralResponse.WsInfoEstudianteGeneralResult wsInfoEstudianteGeneral(java.lang.String codestudiante) {
        org.tempuri.Wsandroid service = new org.tempuri.Wsandroid();
        org.tempuri.WsandroidSoap port = service.getWsandroidSoap();
        return port.wsInfoEstudianteGeneral(codestudiante);
    }
    
    
}
