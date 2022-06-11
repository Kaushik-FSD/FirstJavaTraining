package com.globalpayex.day_5;

import java.util.*;

import com.globalpayex.college.entities.Student;

public class SearchStudent {

	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap<>();
		
		map.put(12, new Student("Mehul", 'm', 12, 89f));
		map.put(11, new Student("Anu", 'F', 11, 79f));
		map.put(17, new Student("Kush", 'm', 17, 69f));
		map.put(10, new Student("Esha", 'F', 10, 59f));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll to search student: ");
		int roll = sc.nextInt();
		
//		if(map.containsKey(roll)) {
//			System.out.println("Student found");
//		}else {
//			System.out.println("Student not found");
//		}
		
		Student s = map.get(roll);
		if(s != null) {
			System.out.println(s.getDetails());
		}else {
			System.out.println("Not found");
		}
		
		sc.close();
	}

}
