package com.globalpayex.college.entities;

public class CollegeUser {

	public String name;
	public char gender;
	
	public CollegeUser(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	public String getDetails() {
//		this -> Student object, Professor Object, Other object
		return String.format("name: %s\nGender: %s", name, gender);
	}
	
	@Override
	public String toString() {
//		return super.toString();
		return String.format("name: %s\nGender: %s", name, gender);
	}
	
	
}
