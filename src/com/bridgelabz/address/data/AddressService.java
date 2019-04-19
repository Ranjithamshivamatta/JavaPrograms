package com.bridgelabz.address.data;

public interface AddressService {
	
		public void addPerson(String firstname,String lastname,String street,String city,String state,Long zipcode,Long phonenumber);
		public void deletePerson();
		public void LastNameSort();
		public void ZipCodeSort();
	}
