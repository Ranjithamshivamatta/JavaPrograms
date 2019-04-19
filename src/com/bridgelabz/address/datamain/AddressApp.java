package com.bridgelabz.address.datamain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import com.bridgelabz.address.data.AddressService;
import com.bridgelabz.address.dataimple.AddressServiceImple;
import com.bridgelabz.util.AlgorithmProgramming;
import com.bridgelabz.util.DataStructureProgramming;

public class AddressApp {

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		 AddressService AddressBookImpl = new AddressServiceImple();
	        AddressServiceImple imp= new AddressServiceImple();
	        {
	            imp.readfile();
	            Scanner sc = new Scanner(System.in);
	            
	            
	            
	            System.out.println(" 1.addperson \n 2.remove person \n 3.sortbyname \n 4.sortzip");
	            System.out.println("Input choice");
	            int input = AlgorithmProgramming.getInt();
	            switch (input){
	            case 1:
	            	
	            	System.out.println("Enter the firstname: ");
	                String firstname=DataStructureProgramming.getString();
	                
	                System.out.println("Enter the lastname: ");
	                String lastname=DataStructureProgramming.getString();
	                
	                System.out.println("Enter the city: ");
	                String city=DataStructureProgramming.getString();
	                
	                System.out.println("Enter the state: ");
	                String state=DataStructureProgramming.getString();
	                
	                System.out.println("Enter the address: ");
	                String address=DataStructureProgramming.getString();
	                
	                System.out.println("Enter the zipcode: ");
	                Long zipcode=DataStructureProgramming.getLong();
	                
	                System.out.println("Enter the phonenumber: ");
	               Long phonenumber=DataStructureProgramming.getLong();
	                
	                imp. addPerson(firstname,  lastname,  city, state, address,  zipcode, phonenumber); 
	                imp.writeFile();
	                break;
	            case 2:
	                imp.deletePerson();
	         
	                
	                break;
	            case 3:
	              imp.LastNameSort();
	                break;
	            case 4:
	                imp.ZipCodeSort();
	                break;
	            }
	            
	                        
	        }
	        
	}}
	


