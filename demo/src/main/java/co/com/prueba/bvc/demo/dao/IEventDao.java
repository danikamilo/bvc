package co.com.prueba.bvc.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.prueba.bvc.demo.entity.EventsModel;

/**
 * 
 * @author danielcamilo.correa
 *
 */
public interface IEventDao extends JpaRepository<EventsModel, Long> {

}
