package com.udaan.covidtracker.com.udaan.covidtracker.dao;

import java.util.Map;

import com.udaan.covidtracker.com.udaan.covidtracker.entity.Admin;

@Component
public class AdminStore implements AdminDao {
	
	private Map<String, Admin> adminStore;
	
	private Integer lastAdminId;

	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub
		String adminId;
		if (admin.getAdminId() == null) {
			lastAdminId = lastAdminId + 1;
			adminId = lastAdminId.toString();
			admin.setAdminId(adminId);
		}
		adminStore.put(admin.getAdminId(), admin);
	}

	@Override
	public Admin findAdminById(String adminId) {
		// TODO Auto-generated method stub
		return adminStore.get(adminId);
	}

}
