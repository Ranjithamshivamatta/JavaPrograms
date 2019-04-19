package com.bridgelabz.address.dataimple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelab.address.model.Address;
import com.bridgelabz.address.data.AddressService;
import com.bridgelabz.inventory.model.Inventory;
import com.bridgelabz.util.DataStructureProgramming;
import com.google.gson.Gson;

public class AddressServiceImple implements AddressService {
	List<Address> addressDetails = new ArrayList<>();
	public void readfile(){
	JSONParser parser = new JSONParser();
	{
		try {
			Object obj = parser.parse(new FileReader("E:\\JavaJ\\Bridgelab\\src\\com\\bridgelab\\address\\model\\Address.json"));
			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(jsonObject);
			JSONArray jsonArray = (JSONArray) jsonObject.get("Address");

			for (Object obj1 : jsonArray) {
				Address detail = new Address();

				String firstname = (String) ((JSONObject) obj1).get("firstName");
				String lastname = (String) ((JSONObject) obj1).get("lastName");
				
				String city = (String) ((JSONObject) obj1).get("city");
				String state = (String) ((JSONObject) obj1).get("state");
				String address = (String) ((JSONObject) obj1).get("address");
				Long zipcode = (Long) ((JSONObject) obj1).get("zipCode");
				Long phonenumber = (Long) ((JSONObject) obj1).get("phoneNumber");

				detail.setFirstName(firstname);
				detail.setLastName(lastname);
				
				detail.setCity(city);
				detail.setState(state);
				detail.setAddress(address);
				detail.setZipCode(zipcode);
				detail.setPhoneNumber(phonenumber);
				addressDetails.add(detail);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}
}

	
	
	@Override
	public void addPerson(String firstname, String lastname, String street, String city, String state, Long zipcode,
			Long phonenumber) {
		// TODO Auto-generated method stub
		Address detail = new Address();

		detail.setFirstName(firstname);
		
		detail.setLastName(lastname);
		
		detail.setCity(city);
		detail.setState(state);
		detail.setAddress(street);
		detail.setZipCode(zipcode);
		detail.setPhoneNumber(phonenumber);

	

		addressDetails.add(detail);
		System.out.println(addressDetails.toString());

	}

	

	@Override
	public void deletePerson() {
		// TODO Auto-generated method stub
		System.out.println("Enter whose detail needs to be removed");
		String removekey = DataStructureProgramming.getString();
		addressDetails.removeIf(address -> address.getFirstName().equals(removekey));
		writeFile();
		System.out.println("Element successfully removed");
	}

	@Override
	public void LastNameSort() {
		// TODO Auto-generated method stub
		addressDetails.sort((Address s1, Address s2)->s1.getFirstName().compareTo(s2.getFirstName())); 
	      addressDetails.forEach((s)->System.out.println(s)); 
	}

	@Override
	public void ZipCodeSort() {
		// TODO Auto-generated method stub
		addressDetails.sort((Address b1, Address b2)->b1.getZipCode().compareTo(b2.getZipCode())); 
	     addressDetails.forEach((s)->System.out.println(s));   
	}
	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(addressDetails);
		try {
			FileWriter file = new FileWriter("E:\\JavaJ\\Bridgelab\\src\\com\\bridgelab\\address\\model\\Address.json");
			file.write("{\"Address\":" + json + "}");
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
