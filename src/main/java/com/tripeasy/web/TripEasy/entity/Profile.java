package com.tripeasy.web.TripEasy.entity;
 
import java.time.LocalDate;
 
import org.springframework.format.annotation.DateTimeFormat;
 
import com.tripeasy.web.TripEasy.pojo.Address;
 
public class Profile {
    private Integer profileId;
    private String photo;
    private String fullName;
    private String emailId;
    private String contactNumber;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private String maritialStatus;
    private Address address;
    private String userName;
    private String password;
    private static int profileGenerator;
    static {
        profileGenerator = 100;
    }
    {
        profileId = ++profileGenerator;
    }
 
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    public Profile(String photo, String fullName, String emailId, String contactNumber, String gender,
            LocalDate dateOfBirth, String maritialStatus, Address address, String userName, String password) {
        super();
        this.photo = photo;
        this.fullName = fullName;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.maritialStatus = maritialStatus;
        this.address = address;
        this.userName = userName;
        this.password = password;
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
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public static int getProfileGenerator() {
        return profileGenerator;
    }
 
    public static void setProfileGenerator(int profileGenerator) {
        Profile.profileGenerator = profileGenerator;
    }
 
    @Override
    public String toString() {
        return "Profile [profileId=" + profileId + ", photo=" + photo + ", fullName=" + fullName + ", emailId="
                + emailId + ", contactNumber=" + contactNumber + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
                + ", maritialStatus=" + maritialStatus + ", address=" + address + ", userName=" + userName
                + ", password=" + password + "]";
    }
}