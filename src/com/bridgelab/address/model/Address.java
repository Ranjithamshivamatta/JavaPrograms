package com.bridgelab.address.model;

public class Address {
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String address;
	Long zipCode;
	Long phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "firstname: " + firstName + "\n " + "lastname: " + lastName + "\n " + "city: " + city + "\n " + "state: "
				+ state + "\n " + "address:" + address + "\n " + "zipcode: " + zipCode + "\n " + "phonenumber: "
				+ phoneNumber;
	}

}
