package com.globalpayex.college.entities;

public class Student {

	String name;
	char gender;
	int roll;
	float marks;
	
	public static int count;
	
	public Student(String name, char gender, int roll, float marks){
		this.name = name;
		this.gender = gender;	
		this.roll = roll;
		this.marks = marks;
	}
	
	public String getDetails() {
		String str = "";
//		str = "Name: " + this.name + '\n' + "Gender: " + this.gender + '\n' 
//				+ "Roll: " + this.roll + '\n' + "Marks: " + this.marks;
//		
//		return str;
		
		++count;
		
		str = String.format("Name: %s\nGender: %s\nRoll: %s\nMarks: %s\n", this.name, this.gender
				, this.roll, this.marks);
		
		return str;
	}
	
	/* Internal Working
	 * 
	 * String getDetails(Student this){
	 * 
	 * }
	 */
	
	public String getGrade() {
		
		if(this.marks < 0 || this.marks >100) {
			return "I";
		}
		
		if(this.marks >= 70) {
			return "A";
		}else if(this.marks >= 60 && this.marks < 70) {
			return "B";
		}else if(this.marks >= 40 && this.marks < 60) {
			return "C";
		}else {
			return "F";
		}
	}
}
