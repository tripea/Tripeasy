package com.tripeasy.web.TripEasy.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tripeasy.web.TripEasy.pojo.Booking;
import com.tripeasy.web.TripEasy.pojo.Flight;
import com.tripeasy.web.TripEasy.pojo.Seat;

/**
 * 
 * @author Shubham Raut
 *
 */
@Service
public interface FlightService {

	ResponseEntity<List> flightsFromSourceToDestination(String source, String destination);


	Booking bookFlight(Booking booking);



	ResponseEntity<Flight> getFlight(Integer flightId);


	ResponseEntity<Flight> updateSelectedSeats(Integer flightId, Flight flight);


	Boolean withdrawMoneyFromUserWallet(Integer profileId, Double totalPrice);



}
