package com.udaan.covidtracker.com.udaan.covidtracker.dao;

import com.udaan.covidtracker.com.udaan.covidtracker.entity.Admin;

public interface AdminDao {

	void save(Admin admin);
	
	Admin findAdminById(String adminId);
}
