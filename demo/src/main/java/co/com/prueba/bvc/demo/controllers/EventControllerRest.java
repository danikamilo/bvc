package co.com.prueba.bvc.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.prueba.bvc.demo.exeption.BvcException;
import co.com.prueba.bvc.demo.services.IEventsService;

/**
 * 
 * @author danielcamilo.correa
 *
 */
@RestController
@RequestMapping("/api/v1/events")
@CrossOrigin(origins = "*", maxAge = 3600)
public class EventControllerRest {
	
	@Autowired
	private IEventsService eventServImpl;
	
	private final Logger LOG = LoggerFactory.getLogger(EventControllerRest.class);
		
	@PostMapping(path = "/save-events", consumes = "text/plain", produces = "application/json")
	public ResponseEntity<?> saveEvents(@RequestBody String eventsModel) {
		try {
			eventServImpl.saveNewEvent(eventsModel);
			return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(eventsModel.toString());
		} catch (BvcException e) {
			LOG.error(e.getMessage(), e);
			return ResponseEntity.badRequest().contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}
	}
	
	@GetMapping("/get-events")
	public ResponseEntity<?> getEvents(){
		try {
			return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(eventServImpl.getEvents());
		} catch (BvcException e) {
			LOG.error(e.getMessage(), e);
			return ResponseEntity.badRequest().contentType(MediaType.APPLICATION_JSON).body(e.getMessage());
		}	
	}

}
