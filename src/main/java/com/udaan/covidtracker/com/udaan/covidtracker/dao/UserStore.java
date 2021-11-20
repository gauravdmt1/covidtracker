package com.udaan.covidtracker.com.udaan.covidtracker.dao;

import java.util.Map;

import com.udaan.covidtracker.com.udaan.covidtracker.entity.User;

@Component
public class UserStore implements UserDao {
	
	private Map<String, User> userStore;
	
	private Integer lastId = 0;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		String userId;
		if (user.getUserId() == null) {
			lastId = lastId + 1;
			userId = lastId.toString();
			user.setUserId(userId);
		}
		userStore.put(user.getUserId(), user);
	}

	@Override
	public User findUserById(String userId) {
		// TODO Auto-generated method stub
		return userStore.get(userId);
	}
}
