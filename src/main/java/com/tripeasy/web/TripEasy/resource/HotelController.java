package com.tripeasy.web.TripEasy.resource;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.tripeasy.web.TripEasy.config.Config;
import com.tripeasy.web.TripEasy.pojo.Booking;
import com.tripeasy.web.TripEasy.pojo.Hotel;
import com.tripeasy.web.TripEasy.pojo.Profile;
import com.tripeasy.web.TripEasy.pojo.Wallet;

@Controller
@RequestMapping("/hotel")
public class HotelController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@Autowired
	private RestTemplate restTemplate;

	private static Integer bookingID;
	private static Integer bookingCounter;
	private static Integer bookingListSize;
	static {
		bookingID = 100;
	}

	private static Hotel staticHotel = new Hotel();

	@RequestMapping("/addhotel")
	public String addHotelForm() {
		return "AddHotel";
	}

	@RequestMapping("/addedhotel")
	public String saveAddHotel(@ModelAttribute Hotel hotel) {
		System.out.println("in add " + hotel);
		return "AddHotel";
	}

	@RequestMapping("/getHotel")
	public ModelAndView getHotel(@RequestParam("hotelId") Integer hotelId) {
		ResponseEntity<Hotel> hotel = restTemplate.getForEntity("http://"+Config.HOTEL_SERVICE+":9095/hotels/" + hotelId,
				Hotel.class);
		staticHotel = hotel.getBody();

		ResponseEntity<Booking[]> bookingList = restTemplate
				.getForEntity("http://"+Config.HOTEL_SERVICE+":7878/bookings/?hotelId=" + hotelId, Booking[].class);
		List<Booking> bookings = Arrays.asList(bookingList.getBody());
		System.out.println("booking list = " + bookingList.getBody().length + " size : " + bookings.size());
		System.out.println("booking list = " + bookingList);
		bookingListSize =  bookingList.getBody().length;
		
	 
		LocalDate checkOutDate = null;
		for (Booking booking : bookings) {
			checkOutDate = booking.getBookedBy().getCheckOutDate();

			System.out.println("bok  =" + booking);
			LocalDate currenetDate = LocalDate.now();
			System.out.println(" currenetDate  " + currenetDate);
			System.out.println(" checkOutDate  " + checkOutDate);

			if (checkOutDate.compareTo(currenetDate)==0) {
				System.out.println("it is working r");
				
			}

		}

//		LocalDate currenetDate = LocalDateTime.now().toLocalDate();
//		System.out.println("currenet date = " +currenetDate);
//		System.out.println("check out  date 1 = " +checkOutDateInLocalDateForm);
//		System.out.println("check out  date 2 = " +checkOutDateInLocalDateForm);
//		if(checkOutDateInLocalDateForm.compareTo(currenetDate)==0) {
//			System.out.println("it is working r");
//			System.out.println( LocalDateTime.now());
//		}

		System.out.println(hotel.getBody().getTotalAvailableRooms());
		return new ModelAndView("HotelInfo", "hotel", hotel.getBody());
	}

	/*
	 * @RequestMapping("/getAllhotels") public ModelAndView getAllhotels() {
	 * 
	 * List<Hotel> hotelList =
	 * restTemplate.getForObject("http://localhost:9095/hotels", List.class); return
	 * new ModelAndView("HotelList", "hotelList", hotelList); }
	 */

	/*
	 * @RequestMapping("/bookHotel") public ModelAndView
	 * bookHotel(@RequestParam("hotelId") Integer hotelId,
	 * 
	 * @RequestParam Integer numberOfGuest,
	 * 
	 * @RequestParam Boolean bookRoom) {
	 * restTemplate.put("http://localhost:9095/hotels/" + hotelId+ "?numberOfGuest="
	 * +numberOfGuest+ "&bookRoom="+bookRoom, null); return new
	 * ModelAndView("hello", "message", "SuccessFull"); }
	 */

	@RequestMapping("/bookingForm")
	public String bookingForm(@RequestParam Double roomprice, Model model) {
		model.addAttribute("roomprice", roomprice);
		return "BookHotel";
	}

	@RequestMapping(value = "/bookingForm/saveHotel", method = RequestMethod.GET)
	public String saveHotelBooking(@ModelAttribute Profile profile, Model model) {
		profile.setProfileId(3);
		System.out.println("prof " + profile.getCheckInDate());
		System.out.println("In save " + staticHotel);
		System.out.println("In save " + profile);
		System.out.println("In save " + staticHotel.getHotelId());
		bookingID++;
		Booking booking = new Booking();
		booking.setBookingID(bookingID);
		booking.setHotel(staticHotel);
		booking.setBookedBy(profile);
		System.out.println("In save booking is " + booking);

		
		Double amount = profile.getFinalAmount();
		try {
		ResponseEntity<Double> output = restTemplate.postForEntity("http://"+Config.WALLET_SERVICE+":8080/wallet/payMoney?senderProfileId="+3+
				"&receiverProfileId=1&amount="+amount+"&transactionRemarks=HotelBooking&transactionType=Debit",null, Double.class);
		restTemplate.postForEntity("http://"+Config.BOOKING_SERVICE+":7878/bookings", booking, null);
		System.out.println("below post");
		restTemplate.put("http://"+Config.HOTEL_SERVICE+":9095/hotels/" + staticHotel.getHotelId() + "?numberOfGuest="
				+ profile.getNumberOfGuest() + "&bookRoom=" + true, null);
		}catch (Exception e) {

			model.addAttribute("message", "Insufficient Fund!");
			return "hotelbooksuccess";
		}
		
		
		model.addAttribute("message", "Booking Successful!");
		return "hotelbooksuccess";
	}

	@RequestMapping("/hotels")
	public ModelAndView hotelsByCity(@RequestParam String city) {
		System.out.println("in search " + city);

		List<Hotel> hotelList = restTemplate.getForObject("http://"+Config.HOTEL_SERVICE+":9095/hotels/?city=" + city, List.class);

		System.out.println("In app controller " + hotelList);
		return new ModelAndView("HotelList", "hotelList", hotelList);
	}
}
