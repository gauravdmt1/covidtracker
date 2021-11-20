package com.udaan.covidtracker.com.udaan.covidtracker.service;

import com.udaan.covidtracker.com.udaan.covidtracker.UserStore;
import com.udaan.covidtracker.com.udaan.covidtracker.dao.UserDao;
import com.udaan.covidtracker.com.udaan.covidtracker.entity.User;
import com.udaan.covidtracker.com.udaan.covidtracker.entity.UserResponse;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("userStore")
	private UserDao userDao;
	
	public UserResponse registerUser(User user) {
		userDao.saveUser(user);
		UserResponse response = new UserResponse();
		response.setUserId(user.getUserId());
		return response;
	}

}
