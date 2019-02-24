package com.tripeasy.web.TripEasy.pojo;
/**
 * 
 * @author Shubham Raut
 *
 */
public class Seat {

	private String flightClass;
	private Integer row;
	private Character column;
	private boolean available;
	private Double price;

	public Seat() {

	}
	
	public Seat(String flightClass, Integer row, Character column, boolean available, Double price) {
		super();
		this.flightClass = flightClass;
		this.row = row;
		this.column = column;
		this.available = available;
		this.price = price;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Character getColumn() {
		return column;
	}

	public void setColumn(Character column) {
		this.column = column;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Seat [flightClass=" + flightClass + ", row=" + row + ", column=" + column + ", available=" + available
				+ ", price=" + price + "]";
	}
	
}
