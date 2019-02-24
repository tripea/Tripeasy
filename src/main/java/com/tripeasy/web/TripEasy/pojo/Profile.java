package com.tripeasy.web.TripEasy.pojo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Profile {
	private Integer profileId;

	private String photo;

	private String fullName;

	private String emailId;

	private String contactNumber;

	private String gender;

	private LocalDate dateOfBirth;

	private String maritialStatus;

	private Address address;

	private Integer numberOfGuest;

	// private Integer numberOfTravellers;
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate checkInDate;
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate checkOutDate;

	private Double finalAmount;

	private Integer numberOfPassengers;

	public Profile() {

		super();

		// TODO Auto-generated constructor stub

	}

	public Profile(Integer profileId, String photo, String fullName, String emailId, String contactNumber,

			String gender, LocalDate dateOfBirth, String maritialStatus, Address address) {

		super();

		this.profileId = profileId;

		this.photo = photo;

		this.fullName = fullName;

		this.emailId = emailId;

		this.contactNumber = contactNumber;

		this.gender = gender;

		this.dateOfBirth = dateOfBirth;

		this.maritialStatus = maritialStatus;

		this.address = address;

	}

	public Integer getProfileId() {

		return profileId;

	}

	public void setProfileId(Integer profileId) {

		this.profileId = profileId;

	}

	public String getPhoto() {

		return photo;

	}

	public void setPhoto(String photo) {

		this.photo = photo;

	}

	public String getFullName() {

		return fullName;

	}

	public void setFullName(String fullName) {

		this.fullName = fullName;

	}

	public String getEmailId() {

		return emailId;

	}

	public void setEmailId(String emailId) {

		this.emailId = emailId;

	}

	public String getContactNumber() {

		return contactNumber;

	}

	public void setContactNumber(String contactNumber) {

		this.contactNumber = contactNumber;

	}

	public String getGender() {

		return gender;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	public LocalDate getDateOfBirth() {

		return dateOfBirth;

	}

	public void setDateOfBirth(LocalDate dateOfBirth) {

		this.dateOfBirth = dateOfBirth;

	}

	public String getMaritialStatus() {

		return maritialStatus;

	}

	public void setMaritialStatus(String maritialStatus) {

		this.maritialStatus = maritialStatus;

	}

	public Address getAddress() {

		return address;

	}

	public void setAddress(Address address) {

		this.address = address;

	}

	public Integer getNumberOfGuest() {

		return numberOfGuest;

	}

	public void setNumberOfGuest(Integer numberOfGuest) {

		this.numberOfGuest = numberOfGuest;

	}

	public LocalDate getCheckInDate() {

		return checkInDate;

	}

	public void setCheckInDate(LocalDate checkInDate) {

		this.checkInDate = checkInDate;

	}

	public LocalDate getCheckOutDate() {

		return checkOutDate;

	}

	public void setCheckOutDate(LocalDate checkOutDate) {

		this.checkOutDate = checkOutDate;

	}

	public Double getFinalAmount() {

		return finalAmount;

	}

	public void setFinalAmount(Double finalAmount) {

		this.finalAmount = finalAmount;

	}

	public Integer getNumberOfPassengers() {

		return numberOfPassengers;

	}

	public void setNumberOfPassengers(Integer numberOfPassengers) {

		this.numberOfPassengers = numberOfPassengers;

	}

	@Override

	public int hashCode() {

		final int prime = 31;

		int result = 1;

		result = prime * result + ((address == null) ? 0 : address.hashCode());

		result = prime * result + ((checkInDate == null) ? 0 : checkInDate.hashCode());

		result = prime * result + ((checkOutDate == null) ? 0 : checkOutDate.hashCode());

		result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());

		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());

		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());

		result = prime * result + ((finalAmount == null) ? 0 : finalAmount.hashCode());

		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());

		result = prime * result + ((gender == null) ? 0 : gender.hashCode());

		result = prime * result + ((maritialStatus == null) ? 0 : maritialStatus.hashCode());

		result = prime * result + ((numberOfGuest == null) ? 0 : numberOfGuest.hashCode());

		result = prime * result + ((numberOfPassengers == null) ? 0 : numberOfPassengers.hashCode());

		result = prime * result + ((photo == null) ? 0 : photo.hashCode());

		result = prime * result + ((profileId == null) ? 0 : profileId.hashCode());

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

		Profile other = (Profile) obj;

		if (address == null) {

			if (other.address != null)

				return false;

		} else if (!address.equals(other.address))

			return false;

		if (checkInDate == null) {

			if (other.checkInDate != null)

				return false;

		} else if (!checkInDate.equals(other.checkInDate))

			return false;

		if (checkOutDate == null) {

			if (other.checkOutDate != null)

				return false;

		} else if (!checkOutDate.equals(other.checkOutDate))

			return false;

		if (contactNumber == null) {

			if (other.contactNumber != null)

				return false;

		} else if (!contactNumber.equals(other.contactNumber))

			return false;

		if (dateOfBirth == null) {

			if (other.dateOfBirth != null)

				return false;

		} else if (!dateOfBirth.equals(other.dateOfBirth))

			return false;

		if (emailId == null) {

			if (other.emailId != null)

				return false;

		} else if (!emailId.equals(other.emailId))

			return false;

		if (finalAmount == null) {

			if (other.finalAmount != null)

				return false;

		} else if (!finalAmount.equals(other.finalAmount))

			return false;

		if (fullName == null) {

			if (other.fullName != null)

				return false;

		} else if (!fullName.equals(other.fullName))

			return false;

		if (gender == null) {

			if (other.gender != null)

				return false;

		} else if (!gender.equals(other.gender))

			return false;

		if (maritialStatus == null) {

			if (other.maritialStatus != null)

				return false;

		} else if (!maritialStatus.equals(other.maritialStatus))

			return false;

		if (numberOfGuest == null) {

			if (other.numberOfGuest != null)

				return false;

		} else if (!numberOfGuest.equals(other.numberOfGuest))

			return false;

		if (numberOfPassengers == null) {

			if (other.numberOfPassengers != null)

				return false;

		} else if (!numberOfPassengers.equals(other.numberOfPassengers))

			return false;

		if (photo == null) {

			if (other.photo != null)

				return false;

		} else if (!photo.equals(other.photo))

			return false;

		if (profileId == null) {

			if (other.profileId != null)

				return false;

		} else if (!profileId.equals(other.profileId))

			return false;

		return true;

	}

	@Override

	public String toString() {

		return "Profile [profileId=" + profileId + ", photo=" + photo + ", fullName=" + fullName + ", emailId="

				+ emailId + ", contactNumber=" + contactNumber + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth

				+ ", maritialStatus=" + maritialStatus + ", address=" + address + ", numberOfGuest=" + numberOfGuest

				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", finalAmount=" + finalAmount

				+ ", numberOfPassengers=" + numberOfPassengers + "]";

	}

}