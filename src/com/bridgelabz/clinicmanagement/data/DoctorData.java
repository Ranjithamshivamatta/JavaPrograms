package com.bridgelabz.clinicmanagement.data;

import java.util.List;

import org.json.simple.parser.JSONParser;

import com.bridgelabz.clinicmanagement.model.Doctor;

public interface DoctorData {
	public void addDoctor(DoctorData doctor);
	
	JSONParser parser = new JSONParser();
	public List<Doctor> getDoctors();

}
