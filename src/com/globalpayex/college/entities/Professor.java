package com.globalpayex.college.entities;

public class Professor extends CollegeUser{
//	String name;
//	char gender;
	String[] subjects;
	
	public Professor(String name, char gender, String[] subjects) {
//		super();
//		this.name = name;
//		this.gender = gender;
		
		super(name, gender);
		this.subjects = subjects;
	}
	
	
}
