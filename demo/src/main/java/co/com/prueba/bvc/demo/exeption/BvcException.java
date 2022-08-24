package co.com.prueba.bvc.demo.exeption;

import java.io.Serializable;

/**
 * 
 * @author danielcamilo.correa
 *
 */
public class BvcException extends Exception implements Serializable  {

	private static final long serialVersionUID = 1L;  
	

	public BvcException() {
		super();
	}	
	
	/**
	 * 
	 * @param mensaje
	 */
	public BvcException(String mensaje) {
		super(mensaje);
	}
	
	/**
	 * 
	 * @param mensaje
	 * @param cause
	 */
	public BvcException(String mensaje, Throwable cause) {
		super(mensaje, cause);
	}
	
	
	/**
	 * 
	 * @param cause
	 */
	public BvcException(Throwable cause) {
		super(cause);
	}

}
