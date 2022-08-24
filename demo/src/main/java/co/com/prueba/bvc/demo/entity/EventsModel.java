package co.com.prueba.bvc.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author danielcamilo.correa
 *
 */
@Entity
@Table(name = "tb_events")
public class EventsModel{
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvent;

    @Column(name="event")
	private String event;
	
    @Column(name="date_event")
	private Date dateEvent;
    
    @Column(name="quantity")
	private Integer quantity;
    
    @Column(name="cost")
	private Integer cost;
	
    @Column(name="platform")
	private String platform;

	public Long getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(Long idEvent) {
		this.idEvent = idEvent;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Date getDateEvent() {
		return dateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	@Override
	public String toString() {
		return "EventsModel [idEvent=" + idEvent + ", event=" + event + ", dateEvent=" + dateEvent + ", cost=" + cost + "]";
	}
	
}
