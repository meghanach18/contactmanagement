package com.example.user.model;

public class Location {

	public Street street;
	public int number;
	public String name;
    public String city;
    public String state;
    public String country;
    public int postcode;
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Location [street=" + street + ", number=" + number + ", name=" + name + ", city=" + city + ", state="
				+ state + ", country=" + country + ", postcode=" + postcode + "]";
	}
	public Location(Street street, int number, String name, String city, String state, String country, int postcode) {
		super();
		this.street = street;
		this.number = number;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postcode = postcode;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    
    
    
    
}
