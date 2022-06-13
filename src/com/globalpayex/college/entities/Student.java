package com.globalpayex.college.entities;

import java.util.Objects;

public class Student extends CollegeUser{

//	String name;
//	char gender;
	public int roll;
	public float marks;
	
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

	public Student(String name, char gender, int roll, float marks,  Address address) {
		super(name, gender, address);
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

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + roll;
//		return result;
		return Objects.hash(roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		return true;
	}


	
	
}
