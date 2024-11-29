package com.springdemo.userapi;

public class User {

	
	String userId;
	String firstName;
	String LastName;
	String phoneNumber;
	
	
	public User(String userId, String firstName, String lastName, String phoneNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		LastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	public User() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	
}
