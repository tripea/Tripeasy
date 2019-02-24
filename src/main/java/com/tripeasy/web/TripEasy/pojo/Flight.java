package com.tripeasy.web.TripEasy.pojo;

import java.time.LocalDateTime;
import java.util.List;
/**
 * 
 * @author Shubham Raut
 *
 */
public class Flight {

	private Integer flightId;
	private String flightName;
	private String airline;
	private String source;
	private String destination;
	private LocalDateTime time;
	
	private List<Seat> seats;
	
	public Flight() {
	}

	public Flight(Integer flightId, String flightName, String airline, String source, String destination,
			LocalDateTime time, List<Seat> seats) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.time = time;
		this.seats = seats;
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", airline=" + airline + ", source="
				+ source + ", destination=" + destination + ", time=" + time + ", seats=" + seats + "]";
	}	
}
