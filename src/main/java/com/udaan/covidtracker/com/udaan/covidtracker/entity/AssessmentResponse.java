package com.udaan.covidtracker.com.udaan.covidtracker.entity;

public class AssessmentResponse {
	
	private Double riskPercentage;
	
	private String message;

	public Double getRiskPercentage() {
		return riskPercentage;
	}

	public void setRiskPercentage(Double riskPercentage) {
		this.riskPercentage = riskPercentage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
