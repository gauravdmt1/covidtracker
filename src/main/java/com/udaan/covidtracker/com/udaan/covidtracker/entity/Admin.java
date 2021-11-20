package com.udaan.covidtracker.com.udaan.covidtracker.entity;

public class Admin {

	private String adminId;
	
	private User user;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
