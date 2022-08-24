package co.com.prueba.bvc.demo.services;

import com.google.gson.JsonArray;

import co.com.prueba.bvc.demo.exeption.BvcException;

/**
 * 
 * @author danielcamilo.correa
 *
 */
public interface IEventsService {
	
	
	/**
	 * @author danielcamilo.correa
	 * 
	 * @return String
	 */
	public String saveNewEvent(String event) throws BvcException;
	
	/**
	 * 
	 * @param event
	 * @return
	 * @throws Exception
	 */
	public JsonArray getEvents() throws BvcException;
	
	
	

}
