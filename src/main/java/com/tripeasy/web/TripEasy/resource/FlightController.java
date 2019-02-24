package com.tripeasy.web.TripEasy.resource;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tripeasy.web.TripEasy.pojo.Booking;
import com.tripeasy.web.TripEasy.pojo.Customer;
import com.tripeasy.web.TripEasy.pojo.Flight;
import com.tripeasy.web.TripEasy.pojo.Profile;
import com.tripeasy.web.TripEasy.pojo.Seat;
import com.tripeasy.web.TripEasy.service.FlightService;

/**
 * 
 * @author Shubham Raut
 *
 */
@Controller
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	FlightService flightService;

	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public String flights(@RequestParam String source, @RequestParam String destination, Model model) {

		ResponseEntity<List> flights = flightService.flightsFromSourceToDestination(source, destination);

		model.addAttribute("flights", flights.getBody());
		return "FlightList";

	}

	@RequestMapping("/selectSeats")
	public String selectSeats(Model model, @RequestParam Integer flightId) {
		ResponseEntity<Flight> flight = flightService.getFlight(flightId);
		List<Seat> seats = flight.getBody().getSeats();
		model.addAttribute("seats", seats);
		model.addAttribute("flight", flight.getBody());
		return "FlightSeats";
	}

	private Flight updatedFlight;
	private Double totalPrice;
	private Integer totalPassengers;
	private Customer passenger;

	@RequestMapping("/selected")
	public String sel(Model model, @RequestParam Integer flightId, @RequestParam String[] cbseats) {
		ResponseEntity<Flight> flightEntity = flightService.getFlight(flightId);
		Flight flight = flightEntity.getBody();
		List<Seat> listOfSeats = flight.getSeats();
		int totalPassenger = 0;
		Double totalPrice = 0.00;

		for (String s : cbseats) {
			ListIterator<Seat> itr = listOfSeats.listIterator();
			while (itr.hasNext()) {
				Seat os = itr.next();
				if (os.getColumn().equals(s.charAt(0)) && os.getRow() == Integer.parseInt(s.charAt(2) + "")) {
					os.setAvailable(false);
					itr.set(os);
					totalPrice += os.getPrice();
					totalPassenger++;
				}
			}
		}

		Boolean isTransactionSuccess = flightService.withdrawMoneyFromUserWallet(3, totalPrice);

		if (isTransactionSuccess) {

		} else {

		}
		this.updatedFlight = flight;
		this.totalPassengers = totalPassenger;
		this.totalPrice = totalPrice;
		flightService.updateSelectedSeats(flightId, flight);

//        String[] selectedStudentIds = request.getParameterValues("selected");
		model.addAttribute("message", "Ticket Booked Successfully");
		return "redirect:/search/" + totalPassenger;

	}

	@RequestMapping("/passengerDetails")
	public String passengerList(@ModelAttribute Customer passenger) {
		System.out.println(passenger);
		this.passenger = passenger;
		return "redirect:bookFlights";

	}

	@RequestMapping("/bookFlight")
	public String bookFlight(@RequestParam Integer flightId) {
		return "BookFlight";
	}

	static int bookingCounter=1000;
	@RequestMapping(value = "/bookFlights", method = RequestMethod.GET)
	public String bookFlights(Model model) {

		Profile p = new Profile();
		p.setProfileId(3);
		p.setFullName("Shubham Raut");
		p.setGender("Male");

		Profile profileOfLoggedInPerson;

		Flight flight1 = new Flight();
		flight1.setFlightId(3);
		flight1.setFlightName("AI-852");
		flight1.setAirline("Airjet");
		flight1.setSource("Pune");
		flight1.setDestination("Mumbai");
		flight1.setTime(LocalDateTime.now());

		List<Seat> seats = new ArrayList<Seat>();
		seats.add(new Seat("Economy", 1, 'C', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'B', true, 2500.00));
		seats.add(new Seat("Economy", 2, 'A', true, 3500.00));
		flight1.setSeats(seats);

		List<Customer> passengers = new ArrayList<>();

		Customer passenger = new Customer();
		passenger.setAge(50);
		passenger.setCustomerId(1);
		passenger.setFirstName("Shubham");
		passenger.setLastName("Raut");
		passenger.setGender("Male");

		passengers.add(passenger);

		Booking booking = new Booking();
		booking.setBookedBy(p);
		booking.setBookingID(bookingCounter++);
		booking.setBookingType("Flight");
		booking.setCustomers(passengers);
		booking.setDateOfBooking(LocalDateTime.now());
		booking.setFlight(updatedFlight);
		booking.setTotalCost(totalPrice);

		Booking b = flightService.bookFlight(booking);

		model.addAttribute("message", b);
		return "success";
	}

	@RequestMapping("confirmBooking")
	public String confirmBooking() {

		return "flightBookingPreview";
	}

}
