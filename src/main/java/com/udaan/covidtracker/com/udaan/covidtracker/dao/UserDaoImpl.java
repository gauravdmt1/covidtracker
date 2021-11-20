package com.udaan.covidtracker.com.udaan.covidtracker.dao;

import com.udaan.covidtracker.com.udaan.covidtracker.dao.jpa.UserRepository;
import com.udaan.covidtracker.com.udaan.covidtracker.entity.User;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserRepository<User, String> userRepository;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public User findUserById(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findOne(userId);
	}

}
