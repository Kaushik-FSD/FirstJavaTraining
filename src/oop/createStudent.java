package oop;

import com.globalpayex.college.entities.StudentOld;

public class createStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student s1 = new Student();
//		s1.name = "Kaushik";
//		s1.gender = 'M';
//		s1.roll = 1805393;
//		s1.marks = 50f;
		
		
		StudentOld s1 = new StudentOld("Kaushik", 'M', 1805393, 89f);
		StudentOld s2 = new StudentOld("XYZ", 'F', 1805394, 78f);
		StudentOld s3 = new StudentOld("Manish", 'M', 1805394, 59f);
		
		System.out.println(s1.getDetails() + "The count is: " + s1.count);
		
		//Internal working
		
		/*
		 * System.out.println(Student.getDetails(s1)); 
		 * 
		 * */
		
//		System.out.println("The Grade is: " + s1.getGrade());
		
		
//		Student[] arr = {s1, s2, s3};
//		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("name: " + arr[i].name + ", Gender: " + arr[i].gender);
//		}
		
		
	}

}
