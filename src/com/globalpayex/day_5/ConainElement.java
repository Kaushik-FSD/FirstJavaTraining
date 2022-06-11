package com.globalpayex.day_5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.globalpayex.college.entities.Student;

public class ConainElement {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
					new Student("Mehul", 'm', 1805393, 89f),
					new Student("Kush", 'm', 993, 99f),
					new Student("Issant", 'm', 222, 39f)
				);

		System.out.println("Enter the roll you want to search for: ");
		Scanner sc = new Scanner(System.in);
		int searchRoll = sc.nextInt();
		
//		boolean isPresent = false;
		
//************************************************************
		
		//This is the conventional method, but we can use built-in method to search. i.e., contains()

	//		for(Student obj: list) {
//			int currRoll = obj.roll;
//			if(currRoll == searchRoll) {
////				System.out.println("The student is found: " + obj.name);
//				isPresent = true;
//				System.out.println(obj.getDetails());
//				break;
//			}
//		}
//		
//		if(isPresent == false) {
//			System.out.println("Student not found");
//		}
		
		
//*************************************************************		
		
		//we can use contains() method instead of writing all these code we can use a built-in method
//		which will compare the data and return accordingly.
//		NOTE: if we are comparing objects then we have to override equals method in the class Student.
		
		boolean isFound = list.contains(new Student("NA", 'm', searchRoll, 0f));
		System.out.println(isFound ? "Student found" : "Student not found");
		
		sc.close();
	}

}
