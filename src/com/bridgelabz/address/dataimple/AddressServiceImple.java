package com.bridgelabz.address.dataimple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelab.address.model.Address;
import com.bridgelabz.address.data.AddressService;
import com.google.gson.Gson;

public class AddressServiceImple implements AddressService {
	JSONArray jsonArray;
    List<Address> addressdetails = new ArrayList<>();

    JSONObject jobject = new JSONObject();
    
    
    public void fileRead() throws FileNotFoundException, IOException, ParseException {
        JSONParser parser = new JSONParser();
        {
            try {
                jsonArray = (JSONArray) parser.parse(new FileReader("E:\\JavaJ\\Bridgelab\\src\\com\\bridgelab\\address\\model\\Address.json"));

                for (Object obj : jsonArray) {
                    Address addressdetail = new Address();

                    jobject = (JSONObject) obj;
                    String firstname = (String) jobject.get("firstName");
                    String lastname = (String) jobject.get("lastName");
                    String city = (String) jobject.get("city");
                    String address = (String) jobject.get("address");
                    String state = (String) jobject.get("state");
                    Long phoneNumber = (Long) jobject.get("phonenumber");
                    Long zipcode = ((Long) jobject.get("zipCode"));

                    addressdetail.setFirstName(firstname);
                    addressdetail.setLastName(lastname);
                    addressdetail.setCity(city);
                    addressdetail.setAddress(address);
                    addressdetail.setState(state);
                    addressdetail.setPhoneNumber(phoneNumber);
                    addressdetail.setZipcode(zipcode);

                    addressdetails.add(addressdetail);
                }
                System.out.println(addressdetails.toString());
            }

            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }

    
	@Override
	public void addPerson(String firstname, String lastname, Long zipcode, Long phonenumber, String city, String state,
			String address) {
		Address addressdetail = new Address();
        addressdetail.setFirstName(firstname);
        addressdetail.setLastName(lastname);
        addressdetail.setCity(city);
        addressdetail.setAddress(address);
        addressdetail.setState(state);
        addressdetail.setPhoneNumber(phonenumber);
        addressdetail.setZipcode(zipcode);

        addressdetails.add(addressdetail);
        addressdetails.forEach(persondetails -> System.out.println(persondetails.toString()));

    }
	    

		// TODO Auto-generated method stub
		
	

	@Override
	public void removePerson() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("enter which elements to be removed :");
        String removeele = sc.nextLine();
        addressdetails.removeIf(inventory -> inventory.getFirstName().equals(removeele));
        writeFile();
        System.out.println("SuccessFully Removed the Elements From The List");
    }
	

	@Override
	public void lastNameSort() {
		// TODO Auto-generated method stub
		 addressdetails.sort((Address s1, Address s2) -> s1.getLastName().compareTo(s2.getLastName()));
	        addressdetails.forEach((s) -> System.out.println(s));
	}

	@Override
	public void zipCodeSort() {
		// TODO Auto-generated method stub
		addressdetails.sort((Address s1, Address s2) -> s1.getZipcode().compareTo(s2.getZipcode()));
        addressdetails.forEach((s) -> System.out.println(s));

	}

	 public void writeFile() {
	        Gson gson = new Gson();
	        String json = gson.toJson(addressdetails);
	        System.out.println(json);
	        System.out.println(addressdetails);

	        try (FileWriter file = new FileWriter("E:\\JavaJ\\Bridgelab\\src\\com\\bridgelab\\address\\model\\Address.json")) {
	            file.write(json);
	            System.out.println("SuccessFully copied to JSON  Object to File......");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
}
