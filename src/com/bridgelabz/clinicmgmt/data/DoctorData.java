package com.bridgelabz.clinicmgmt.data;

import java.util.List;

import org.json.simple.parser.JSONParser;

import com.bridgelabz.clinicmgmt.model.Doctor;

public interface DoctorData {
	public void addDoctor(DoctorData doctor);
	JSONParser parser = new JSONParser();
	public List<Doctor> getDoctors();

}
