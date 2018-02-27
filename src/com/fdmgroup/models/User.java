package com.fdmgroup.models;

public class User {
	
	private String firstName;
	
	private String lastName;
	
	private int SIN;
	
	private String gender;
	
	private Cart userCart;
	
	private String userType;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSIN() {
		return SIN;
	}

	public void setSIN(int sIN) {
		SIN = sIN;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Cart getUserCart() {
		return userCart;
	}

	public void setUserCart(Cart userCart) {
		this.userCart = userCart;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
}
