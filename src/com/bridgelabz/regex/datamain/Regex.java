package com.bridgelabz.regex.datamain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.regex.dataImple.RegexImple;
import com.bridgelabz.util.DataStructureProgramming;
import com.bridgelabz.util.FileOperations;

public class Regex {
	public static void main(String[] args) throws FileNotFoundException {
		
		BufferedReader bufferReader = new BufferedReader(FileOperations.readFile("E:\\JavaJ\\Regex.txt"));
		String message = "";
		String word = "";
		try {
			while ((word = bufferReader.readLine()) != null) {
				message = word;
			}
			System.out.println(message);
			bufferReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Please enter the first name");
		String firstName = DataStructureProgramming.getString();
		System.out.println("Please enter the last name");
		String lastName = DataStructureProgramming.getString();
		String fullName = firstName + " " + lastName;
		System.out.println("Please enter your 10 digit phone number");
		String phoneNum = DataStructureProgramming.getString();
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = dateFormat.format(date);
		String messageReplace =RegexImple.replace(firstName, fullName, phoneNum, formattedDate, message);

		System.out.println(messageReplace);

	}
}