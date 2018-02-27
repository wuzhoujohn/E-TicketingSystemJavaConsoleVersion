package com.fdmgroup.models;

public class Address {

	private String country;
	
	private String province;
	
	private String city;
	
	private String street;
	
	private String postalCode;
	
	
	public Address(String country, String province, String city, String street, String postalCode) {
		super();
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.postalCode = postalCode;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address: country=" + country + ", province=" + province + ", city=" + city + ", street=" + street
				+ ", postalCode=" + postalCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
