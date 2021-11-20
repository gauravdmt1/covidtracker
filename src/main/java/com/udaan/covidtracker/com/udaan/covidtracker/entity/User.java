package com.udaan.covidtracker.com.udaan.covidtracker.entity;

import java.time.LocalDate;

public class User {
	
	private String userId;
	
	private String name;
	
	private String phoneNumber;
	
	private String pincode;
	
	private String email;
	
	private boolean assessmentTaken;
	
	private LocalDate assessmentDate;
	
	private double riskPercentage;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAssessmentTaken() {
		return assessmentTaken;
	}

	public void setAssessmentTaken(boolean assessmentTaken) {
		this.assessmentTaken = assessmentTaken;
	}

	public LocalDate getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(LocalDate assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	public double getRiskPercentage() {
		return riskPercentage;
	}

	public void setRiskPercentage(double riskPercentage) {
		this.riskPercentage = riskPercentage;
	}

}
