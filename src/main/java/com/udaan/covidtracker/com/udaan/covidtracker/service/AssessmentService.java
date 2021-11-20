package com.udaan.covidtracker.com.udaan.covidtracker.service;

import java.util.List;

import com.udaan.covidtracker.com.udaan.covidtracker.UserStore;
import com.udaan.covidtracker.com.udaan.covidtracker.dao.UserDao;
import com.udaan.covidtracker.com.udaan.covidtracker.entity.AssessmentRequest;
import com.udaan.covidtracker.com.udaan.covidtracker.entity.User;

public class AssessmentService {
	
	@Autowired
	private UserDao userDao; 
	
	public double calculateRiskPercentage(AssessmentRequest request) {
		String userId = request.getUserId();
		if (userId == null || userId.isEmpty() || userDao.findUserById(userId) == null) {
			return -1;
		}
		List<String> symptoms = request.getSymptoms();
		boolean travelHistory = request.hasTravelHistory();
		boolean contactWithCovidPatient = request.hasContactWithCovidPatient();
		boolean noSymptoms = symptoms == null || symptoms.isEmpty();
		
		double riskPercentage;
		
		if (noSymptoms && !travelHistory && !contactWithCovidPatient) {
			riskPercentage = 5;
		} else if (!noSymptoms) {
			if (symptoms.size() == 1) {
				riskPercentage = 50;
			} else if (symptoms.size() == 2) {
				riskPercentage = 75;
			} else {
				riskPercentage = 95;
			}
		}
		
		User user = userDao.getUserById(userId);
		user.setAssessmentTaken(true);
		user.setRiskPercentage(riskPercentage);
		return riskPercentage;
	}

}
