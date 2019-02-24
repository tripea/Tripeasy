package com.tripeasy.web.TripEasy.pojo;

import java.time.LocalDateTime;
//import java.util.ArrayList;
import java.util.List;

//import org.springframework.data.annotation.Id;
//import org.springframework.stereotype.Component;

//import com.tripeasy.bookings.bookingservice.hotelentity.Hotel;
//import com.tripeasy.bookings.bookingservice.hotelentity.Room;

//@Component
public class Booking {

	// @Id
	private Integer bookingID;
	private String bookingType;
	private Object bookingDetails;
	private LocalDateTime dateOfBooking;
	private Double totalCost;
	private List<Customer> customers;
	private Profile bookedBy;
	private Hotel hotel;
	private Room room;
	private Flight flight;
	private LocalDateTime checkInDate;
	 private LocalDateTime checkOutDate;
	private Integer numberOfCustomers;
	private Integer numberOfGuest;
	private Integer numberOfPassengers;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Integer bookingID, String bookingType, Object bookingDetails, LocalDateTime dateOfBooking,
			Double totalCost, List<Customer> customers, Profile bookedBy, Hotel hotel, Room room, Flight flight) {
		super();
		this.bookingID = bookingID;
		this.bookingType = bookingType;
		this.bookingDetails = bookingDetails;
		this.dateOfBooking = dateOfBooking;
		this.totalCost = totalCost;
		this.customers = customers;
		this.bookedBy = bookedBy;
		this.hotel = hotel;
		this.room = room;
		this.flight = flight;
		// this.numberOfPassengers = numberOfPassengers;
	}

	public LocalDateTime getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDateTime checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDateTime getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDateTime checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Integer getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public void setNumberOfCustomers(Integer numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}

	public Integer getNumberOfGuest() {
		return numberOfGuest;
	}

	public void setNumberOfGuest(Integer numberOfGuest) {
		this.numberOfGuest = numberOfGuest;
	}

	public Integer getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(Integer numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public Integer getBookingID() {
		return bookingID;
	}

	public void setBookingID(Integer bookingID) {
		this.bookingID = bookingID;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public Object getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(Object bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public LocalDateTime getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(LocalDateTime dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Profile getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(Profile bookedBy) {
		this.bookedBy = bookedBy;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookedBy == null) ? 0 : bookedBy.hashCode());
		result = prime * result + ((bookingDetails == null) ? 0 : bookingDetails.hashCode());
		result = prime * result + ((bookingID == null) ? 0 : bookingID.hashCode());
		result = prime * result + ((bookingType == null) ? 0 : bookingType.hashCode());
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		result = prime * result + ((dateOfBooking == null) ? 0 : dateOfBooking.hashCode());
		result = prime * result + ((flight == null) ? 0 : flight.hashCode());
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((totalCost == null) ? 0 : totalCost.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		if (bookedBy == null) {
			if (other.bookedBy != null)
				return false;
		} else if (!bookedBy.equals(other.bookedBy))
			return false;
		if (bookingDetails == null) {
			if (other.bookingDetails != null)
				return false;
		} else if (!bookingDetails.equals(other.bookingDetails))
			return false;
		if (bookingID == null) {
			if (other.bookingID != null)
				return false;
		} else if (!bookingID.equals(other.bookingID))
			return false;
		if (bookingType == null) {
			if (other.bookingType != null)
				return false;
		} else if (!bookingType.equals(other.bookingType))
			return false;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		if (dateOfBooking == null) {
			if (other.dateOfBooking != null)
				return false;
		} else if (!dateOfBooking.equals(other.dateOfBooking))
			return false;
		if (flight == null) {
			if (other.flight != null)
				return false;
		} else if (!flight.equals(other.flight))
			return false;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
				if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (totalCost == null) {
			if (other.totalCost != null)
				return false;
		} else if (!totalCost.equals(other.totalCost))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", bookingType=" + bookingType + ", bookingDetails=" + bookingDetails
				+ ", dateOfBooking=" + dateOfBooking + ", totalCost=" + totalCost + ", customers=" + customers
				+ ", bookedBy=" + bookedBy + ", hotel=" + hotel + ", room=" + room + ", flight=" + flight + "]";
	}



}