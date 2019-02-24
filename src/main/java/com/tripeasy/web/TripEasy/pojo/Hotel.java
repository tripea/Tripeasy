package com.tripeasy.web.TripEasy.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hotel {

	private Integer hotelId;
	private String hotelName;
	private HotelAddress address;
	private HashMap<Integer, String> review;
	private Set<Room> rooms;
	private List<String> photos;
	private Integer totalRooms;
	private Integer totalAvailableRooms;
	/*
	 * private googleMap;
	 */

	private Map<String, List<String>> facilities;
	private String description;
	private String lattitude;
	private String longitude;

	public Hotel() {
	 
		super();

	}

	public Hotel(Integer hotelId, String hotelName, HotelAddress address) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.address = address;
	}

	/*
	 * public Hotel(Integer hotelId, String hotelName, Address address,
	 * HashMap<Integer, String> review, Set<Room> rooms, List<String> photos,
	 * Integer totalRooms, Integer totalAvailableRooms, Map<String, List<String>>
	 * facilities, String description, String lattitude, String longitude) {
	 * super(); this.hotelId = hotelId; this.hotelName = hotelName; this.address =
	 * address; this.review = review; this.rooms = rooms; this.photos = photos;
	 * this.totalRooms = totalRooms; this.totalAvailableRooms = totalRooms;
	 * this.facilities = facilities; this.description = description; this.lattitude
	 * = lattitude; this.longitude = longitude; }
	 */

	public Hotel(Integer hotelId, String hotelName, HotelAddress address, HashMap<Integer, String> review, Set<Room> rooms,
			List<String> photos, Map<String, List<String>> facilities, String description, Integer totalRooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.address = address;
		this.review = review;
		this.rooms = rooms;
		this.photos = photos;
		this.facilities = facilities;
		this.description = description;
		this.totalRooms = totalRooms;
	}

	public Hotel(Integer hotelId, String hotelName, HotelAddress address, HashMap<Integer, String> review, Set<Room> rooms,
			List<String> photos, Integer totalRooms, Map<String, List<String>> facilities, String description,
			String lattitude, String longitude) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.address = address;
		this.review = review;
		this.rooms = rooms;
		this.photos = photos;
		this.totalRooms = totalRooms;
		this.facilities = facilities;
		this.description = description;
		this.lattitude = lattitude;
		this.longitude = longitude;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public HotelAddress getAddress() {
		return address;
	}

	public void setAddress(HotelAddress address) {
		this.address = address;

	}

	public HashMap<Integer, String> getReview() {
		return review;
	}

	public void setReview(HashMap<Integer, String> review) {
		this.review = review;
	}

	public Set<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}

	public Integer getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(Integer totalRooms) {
		this.totalRooms = totalRooms;
	}

	public Integer getTotalAvailableRooms() {
		return totalAvailableRooms;
	}

	public void setTotalAvailableRooms(Integer totalAvailableRooms) {
		this.totalAvailableRooms = totalAvailableRooms;
	}

	public Map<String, List<String>> getFacilities() {
		return facilities;
	}

	public void setFacilities(Map<String, List<String>> facilities) {
		this.facilities = facilities;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLattitude() {
		return lattitude;
	}

	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((facilities == null) ? 0 : facilities.hashCode());
		result = prime * result + ((hotelId == null) ? 0 : hotelId.hashCode());
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + ((lattitude == null) ? 0 : lattitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((photos == null) ? 0 : photos.hashCode());
		result = prime * result + ((review == null) ? 0 : review.hashCode());
		result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
		result = prime * result + ((totalAvailableRooms == null) ? 0 : totalAvailableRooms.hashCode());
		result = prime * result + ((totalRooms == null) ? 0 : totalRooms.hashCode());
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
		Hotel other = (Hotel) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (facilities == null) {
			if (other.facilities != null)
				return false;
		} else if (!facilities.equals(other.facilities))
			return false;
		if (hotelId == null) {
			if (other.hotelId != null)
				return false;
		} else if (!hotelId.equals(other.hotelId))
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (lattitude == null) {
			if (other.lattitude != null)
				return false;
		} else if (!lattitude.equals(other.lattitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (photos == null) {
			if (other.photos != null)
				return false;
		} else if (!photos.equals(other.photos))
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		if (rooms == null) {
			if (other.rooms != null)
				return false;
		} else if (!rooms.equals(other.rooms))
			return false;
		if (totalAvailableRooms == null) {
			if (other.totalAvailableRooms != null)
				return false;
		} else if (!totalAvailableRooms.equals(other.totalAvailableRooms))
			return false;
		if (totalRooms == null) {
			if (other.totalRooms != null)
				return false;
		} else if (!totalRooms.equals(other.totalRooms))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address + ", review=" + review
				+ ", rooms=" + rooms + ", photos=" + photos + ", totalRooms=" + totalRooms + ", totalAvailableRooms="
				+ totalAvailableRooms + ", facilities=" + facilities + ", description=" + description + ", lattitude="
				+ lattitude + ", longitude=" + longitude + "]";
	}

	
}
