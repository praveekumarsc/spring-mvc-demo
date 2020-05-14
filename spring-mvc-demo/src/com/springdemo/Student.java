package com.springdemo;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;	
	private LinkedHashMap<String, String> countryOptions;
	private String favoritelanguage;
	
	public Student() {
		
		countryOptions= new LinkedHashMap<>();
		countryOptions.put("BR","Brazil");
		countryOptions.put("GR","germany");
		countryOptions.put("IN","India");
		countryOptions.put("FR","France");
		countryOptions.put("US","Unites States");		
	}
	public String getFavoritelanguage() {
		return favoritelanguage;
	}

	public void setFavoritelanguage(String favoritelanguage) {
		this.favoritelanguage = favoritelanguage;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

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
	
}
