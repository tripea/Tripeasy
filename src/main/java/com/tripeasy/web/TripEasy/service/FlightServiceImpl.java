package com.tripeasy.web.TripEasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tripeasy.web.TripEasy.config.Config;
import com.tripeasy.web.TripEasy.pojo.Booking;
import com.tripeasy.web.TripEasy.pojo.Flight;

/**
 * 
 * @author Shubham Raut
 *
 */
@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public ResponseEntity<List> flightsFromSourceToDestination(String source, String destination) {
		String url = "http://"+Config.FLIGHT_SERVICE+":7070/flight?source=" + source + "&destination=" + destination;
		return restTemplate.getForEntity(url, List.class);
	}

	@Override
	public Booking bookFlight(Booking booking) {
		return restTemplate.postForObject("http://"+Config.BOOKING_SERVICE+":7878/bookings/type/?bookingType=flight", booking, Booking.class);
	}


	@Override
	public ResponseEntity<Flight> getFlight(Integer flightId) {
		String url="http://"+Config.FLIGHT_SERVICE+":7070/flight/"+flightId;
		return restTemplate.getForEntity(url, Flight.class);
	}

	@Override
	public ResponseEntity<Flight> updateSelectedSeats(Integer flightId,Flight flight) {
		String url="http://"+Config.FLIGHT_SERVICE+":7070/flight";
		
		restTemplate.postForEntity(url, flight, Flight.class);
		return new ResponseEntity<Flight>(flight,HttpStatus.OK);
	}
	@Override
	public Boolean withdrawMoneyFromUserWallet(Integer profileId, Double totalPrice) {
		String url="http://"+Config.WALLET_SERVICE+":8080/wallet/payMoney?senderProfileId="+profileId+
				"&receiverProfileId=1&amount="+totalPrice+"&transactionRemarks=FlightBooking&transactionType=Debit";
		restTemplate.postForEntity(url, null, Double.class);
		return true;
	}


}
