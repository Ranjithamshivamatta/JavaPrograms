package com.bridgelabz.address.datamain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import com.bridgelabz.address.data.AddressService;
import com.bridgelabz.address.dataimple.AddressServiceImple;
import com.bridgelabz.util.AlgorithmProgramming;

public class AddressApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AddressService AddressBookImpl = new AddressServiceImple();
	        AddressServiceImple imp= new AddressServiceImple();
	        {
	            try {
					imp.fileRead();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            Scanner sc = new Scanner(System.in);
	            
	            
	            
	            System.out.println(" 1.addperson \n 2.remove person \n 3.sortbyname \n 4.sortzip");
	            System.out.println("Input choice");
	            int input = AlgorithmProgramming.getInt();
	            switch (input){
	            case 1:
	                imp.addPerson("Anu", "Kavya", 213211l, 1234567898l,"Rajmathe","Mysore","Bangalore");
	                break;
	            case 2:
	                imp.removePerson();
	                break;
	            case 3:
	              imp.lastNameSort();
	                break;
	            case 4:
	                imp.zipCodeSort();
	                break;
	            }
	            imp.writeFile();
	                        
	        }
	        }
	    
	}


