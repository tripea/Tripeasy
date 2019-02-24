package com.tripeasy.web.TripEasy.pojo;


public class Address {
	private String streetName;
	private Integer streetNo;
	private String state;
	private Integer pincode;

	public Address(String streetName, Integer streetNo, String state, Integer pincode) {
		super();
		this.streetName = streetName;
		this.streetNo = streetNo;
		this.state = state;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Integer getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(Integer streetNo) {
		this.streetNo = streetNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", streetNo=" + streetNo + ", state=" + state + ", pincode="
				+ pincode + "]";
	}

}
