package com.bridgelabz.clinicmgmt.datamain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ClinicManagement {

public static void main(String[] args) throws FileNotFoundException, IOException {
		
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader(
				"E:\\JavaJ\\Bridgelab\\src\\com\\bridgelabz\\clinicmgmt\\model\\Doctor.json")) {
			Object obj = jsonParser.parse(reader);
			JSONObject DoctorList = (JSONObject) obj;
			System.out.println(DoctorList);
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
	
	
}
}