package com.tripeasy.web.TripEasy.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.tripeasy.web.TripEasy.config.Config;
import com.tripeasy.web.TripEasy.pojo.Booking;

/**
 * 
 * @author pparaska
 *
 */
@Controller
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
	RestTemplate restTemplate;

	private static Integer bookingID;
	static {
		bookingID = 10;
	}

	private static Booking staticBooking = new Booking();

	/*
	 * @RequestMapping("/getAllBookings") public ModelAndView getAllBookings() { //
	 * TODO delete SYSO System.out.println("inside get all bookings"); List<Booking>
	 * bookingList = restTemplate.getForObject("http://10.246.92.145:7878/bookings",
	 * List.class); // return new ModelAndView("BookingList", "bookingList",
	 * bookingList); return new ModelAndView("BookingList", "bookingList",
	 * bookingList); }
	 */

	@RequestMapping("/profileId")
	public String enterProfileId() {
		System.out.println("inside Profile Id");
		return "ProfileId";
	}

	@RequestMapping("/getBookingDetailsByProfileId/{profileId}")
	public ModelAndView getBookingDetailsByProfile(@PathVariable("profileId") Integer profileId) {
		System.out.println("Inside get by profile Id");
		List<Booking> bookingList = restTemplate
				.getForObject("http://"+Config.BOOKING_SERVICE+":7878/bookings/profile/?profileId=" + profileId, List.class);
		return new ModelAndView("BookingList", "bookingList", bookingList);
	}

	/*
	 * @RequestMapping("/guestsDetails") public String fillGuestDetails() { // TODO
	 * delete SYSO System.out.println("inside guest info"); return "GuestDetails"; }
	 */

	@RequestMapping("/passengerDetails")
	public String fillPassengerDetails() {
		// TODO delete SYSO
		System.out.println("inside passenges details");
		return "PassengerDetails";

	}

	/*
	 * @RequestMapping("/bookingInformation") public String getBookingInformation()
	 * { // TODO delete SYSO System.out.println("inside booking information");
	 * return "BookingInformation";
	 * 
	 * }
	 */
	/*
	 * @RequestMapping("/bookhotel") public String bookhotel(@RequestParam Booking
	 * booking) { System.out.println("in booking");
	 * restTemplate.postForEntity("http://10.246.92.145:7878/bookings", booking,
	 * null); // model.addAttribute("message", "Booking Successful"); // TODO delete
	 * this return "hiiPoonam"; }
	 */

}
