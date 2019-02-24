package com.tripeasy.web.TripEasy.pojo;

import java.util.Iterator;
import java.util.List;

public class Room {
	private Integer roomNumber;
	private String roomType;
	private Double price;
	private Integer bedCount;
	private String bedType;
	private boolean miniBar;
	private List<String> photos;

	// private boolean isAvailable;
	// private Integer numberOfGuestAllowed;
	// private Integer numberOfGuest;

	public Room() {
		super();

	}

	public Room(Integer roomNumber, String roomType, Double price, Integer bedCount, String bedType, boolean miniBar,
			List<String> photos, boolean isAvailable) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.price = price;
		this.bedCount = bedCount;
		this.bedType = bedType;
		this.miniBar = miniBar;
		this.photos = photos;
	}

	public Room(Integer roomNumber, String roomType, Double price, Integer bedCount, String bedType, boolean miniBar,
			List<String> photos) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.price = price;
		this.bedCount = bedCount;
		this.bedType = bedType;
		this.miniBar = miniBar;
		this.photos = photos;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getBedCount() {
		return bedCount;
	}

	public void setBedCount(Integer bedCount) {
		this.bedCount = bedCount;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public boolean isMiniBar() {
		return miniBar;
	}

	public void setMiniBar(boolean miniBar) {
		this.miniBar = miniBar;
	}

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bedCount == null) ? 0 : bedCount.hashCode());
		result = prime * result + ((bedType == null) ? 0 : bedType.hashCode());
		result = prime * result + (miniBar ? 1231 : 1237);
		result = prime * result + ((photos == null) ? 0 : photos.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((roomNumber == null) ? 0 : roomNumber.hashCode());
		result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
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
		Room other = (Room) obj;
		if (bedCount == null) {
			if (other.bedCount != null)
				return false;
		} else if (!bedCount.equals(other.bedCount))
			return false;
		if (bedType == null) {
			if (other.bedType != null)
				return false;
		} else if (!bedType.equals(other.bedType))
			return false;
		if (miniBar != other.miniBar)
			return false;
		if (photos == null) {
			if (other.photos != null)
				return false;
		} else if (!photos.equals(other.photos))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (roomNumber == null) {
			if (other.roomNumber != null)
				return false;
		} else if (!roomNumber.equals(other.roomNumber))
			return false;
		if (roomType == null) {
			if (other.roomType != null)
				return false;
		} else if (!roomType.equals(other.roomType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomType=" + roomType + ", price=" + price + ", bedCount="
				+ bedCount + ", bedType=" + bedType + ", miniBar=" + miniBar + ", photos=" + photos + "]";
	}

}
