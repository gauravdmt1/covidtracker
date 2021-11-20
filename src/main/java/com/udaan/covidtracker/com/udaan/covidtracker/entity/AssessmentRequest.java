package com.udaan.covidtracker.com.udaan.covidtracker.entity;

import java.util.List;

public class AssessmentRequest {

	private String userId;
	
	private List<String> symptoms;
	
	private boolean travelHistory;
	
	private boolean contactWithCovidPatient;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}

	public boolean hasTravelHistory() {
		return travelHistory;
	}

	public void setTravelHistory(boolean travelHistory) {
		this.travelHistory = travelHistory;
	}

	public boolean hasContactWithCovidPatient() {
		return contactWithCovidPatient;
	}

	public void setContactWithCovidPatient(boolean contactWithCovidPatient) {
		this.contactWithCovidPatient = contactWithCovidPatient;
	}
}
