package com.udaan.covidtracker.com.udaan.covidtracker.dao;

import com.udaan.covidtracker.com.udaan.covidtracker.entity.User;

public interface UserDao {

	void saveUser(User user);
	
	User findUserById(String userId);
}
