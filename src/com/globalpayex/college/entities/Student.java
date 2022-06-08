package com.globalpayex.college.entities;

public class Student extends CollegeUser{

//	String name;
//	char gender;
	int roll;
	float marks;
	
	public Student(String name, char gender, int roll, float marks) {
//		super();
		//Internally super
		/*
		 * CollegeUSer(this)
		 */
		
//		this.name = name;
//		this.gender = gender;
		
		super(name, gender);
		this.roll = roll;
		this.marks = marks;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
//		return String.format("name: %s\nGender: %s\nRoll: %s\nMarks: %s", name, gender, roll, marks);
		String stre = super.getDetails();
		/*
		 * CollegeUser.getDetails(this);
		 */
		
		return String.format("%s\nRoll: %s\nMarks: %s", stre, roll, marks);
		
	}
	
	
}
