package com.bridgelabz.address.data;

public interface AddressService {
	 public void addPerson(String firstname, String lastname, Long zipcode, Long phonenumber, String city, String state, String address);
	    public void removePerson();
	    public void lastNameSort();
	    public void zipCodeSort();
}
