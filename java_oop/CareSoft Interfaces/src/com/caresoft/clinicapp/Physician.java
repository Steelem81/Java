package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
  
    private ArrayList<String> patientNotes;
	
    public Physician() {
    }
    
    public Physician(int id) {
    	super.setId(id);
    }
    
    public Physician(int id, int pin) {
    	super.setId(id);
    	this.setPin(pin);
    }
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	@Override
	public boolean assignPin(int pin) {
		boolean pinGt4 = false;
		if(String.valueOf(pin).length() >= 4) {
			pinGt4 = true;
			this.pin = pin;
		}
		return pinGt4;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		boolean confirmed = false;
		if (this.id == confirmedAuthID) {
			confirmed = true;
			
		}
		return confirmed;
	}
	
    // TO DO: Setters & Getters

}
