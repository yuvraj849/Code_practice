package com.kafkaproject.springboot.payload;

public class User {
	private String firstName;
	private String LastName;
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
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", LastName=" + LastName + "]";
	}
	
}
