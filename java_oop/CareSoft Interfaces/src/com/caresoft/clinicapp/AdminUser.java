package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    
    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    public AdminUser() {
    	
    }
    
    public AdminUser(int id, String role) {
    	super.setId(id);
    	this.setRole(role);
    	this.securityIncidents = new ArrayList<String>();
    }
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.getSecurityIncidents();
	}

	@Override
	public boolean assignPin(int pin) {
		boolean pinGt6 = false;
		if (String.valueOf(pin).length() >= 6) {
			pinGt6 = true;
			this.pin = pin;
		}
		return pinGt6;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		boolean confirmed = false;
	
		if (this.id == confirmedAuthID) {
			confirmed = true;
		}
		this.authIncident();
		return confirmed;
	}
    
    // TO DO: Setters & Getters

}
