package co.com.prueba.bvc.demo.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import co.com.prueba.bvc.demo.dao.IEventDao;
import co.com.prueba.bvc.demo.entity.EventsModel;
import co.com.prueba.bvc.demo.exeption.BvcException;
import co.com.prueba.bvc.demo.services.IEventsService;
import co.com.prueba.bvc.util.Constants;

@Repository
public class EventsServicesImpl implements IEventsService {
	
	@Autowired
	private IEventDao eventDao;
	
	@Autowired
	private Environment properties;
	
	@Override
	public String saveNewEvent(String event) throws BvcException {
		EventsModel eventsModel = new EventsModel();
		if(event.isEmpty() || event.equals(Constants.EMPTY_JSON_OBJECT) || event.equals(Constants.EMPTY_JSON_ARRAY)) { 
			throw new BvcException(properties.getProperty("information.service.not.found"));
		}
		eventsModel = new Gson().fromJson(event, EventsModel.class);
		eventsModel.setCost(eventsModel.getCost() * eventsModel.getQuantity());
		eventsModel.setDateEvent(new Date());
		eventDao.save(eventsModel);
		return eventsModel.toString();
	}

	@Override
	public JsonArray getEvents() throws BvcException {
		List<EventsModel> listEventModel = new ArrayList<EventsModel>();
		JsonArray arrayEvent = new JsonArray();
		listEventModel = eventDao.findAll();
		JsonObject jsonObjEvent;
		for(EventsModel eventsModel : listEventModel) {
			jsonObjEvent = new JsonObject();
			jsonObjEvent.addProperty("cost", eventsModel.getCost());
			jsonObjEvent.addProperty("dateEvent", eventsModel.getDateEvent().toString());
			jsonObjEvent.addProperty("event", eventsModel.getEvent());
			jsonObjEvent.addProperty("platform", eventsModel.getPlatform());
			jsonObjEvent.addProperty("quantity", eventsModel.getQuantity());
			arrayEvent.add(jsonObjEvent);
		}
		return arrayEvent;
	}

}
