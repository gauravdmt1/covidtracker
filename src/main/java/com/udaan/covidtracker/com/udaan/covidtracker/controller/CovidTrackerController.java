package com.udaan.covidtracker.com.udaan.covidtracker.controller;

import com.udaan.covidtracker.com.udaan.covidtracker.entity.AssessmentRequest;
import com.udaan.covidtracker.com.udaan.covidtracker.entity.AssessmentResponse;
import com.udaan.covidtracker.com.udaan.covidtracker.entity.User;
import com.udaan.covidtracker.com.udaan.covidtracker.entity.UserResponse;
import com.udaan.covidtracker.com.udaan.covidtracker.service.AssessmentService;
import com.udaan.covidtracker.com.udaan.covidtracker.service.UserService;

@RestController
@Path("/covidtracker")
public class CovidTrackerController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AssessmentService assessmentService;

	@POST
	@Path("/registerUser")
	@Produces("application/json")
	public UserResponse registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
	@POST
	@Path("/selfAssessment")
	@Produces("application/json")
	public AssessmentResponse selfAssessment(@RequestBody AssessmentRequest assessmentRequest) {
		double riskPercentage = assessmentService.calculateRiskPercentage(assessmentRequest);
		AssessmentResponse response = new AssessmentResponse();
		if (riskPercentage < 0) {
			response.setMessage("Invalid request");
		} else {
			response.setRiskPercentage(riskPercentage);
		}
		return response;
	}
}
