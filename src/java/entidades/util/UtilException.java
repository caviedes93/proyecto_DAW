/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades.util;

/**
 *
 * @author andres
 */
public class UtilException extends Exception{
    
    public UtilException() {
	super();
    }

    public UtilException(String message, Throwable cause) {
	super(message, cause);
    }

    public UtilException(String message) {
	super(message);
    }

    public UtilException(Throwable cause) {
    	super(cause);
    }
    
}
