package com.udaan.covidtracker.com.udaan.covidtracker;

import java.util.Map;

import com.udaan.covidtracker.com.udaan.covidtracker.entity.User;

@Component
public class UserStore {
	
	private Map<String, User> userStore;
	
	private Integer lastId = 0;
	
	public boolean addToStore(User user) {
		String userId;
		if (user.getUserId() == null) {
			lastId = lastId + 1;
			userId = lastId.toString();
			user.setUserId(userId);
		}
		userStore.put(user.getUserId(), user);
		return true;
	}

	public User getUserById(String userId) {
		return userStore.get(userId);
	}
}
