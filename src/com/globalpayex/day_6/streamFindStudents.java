package com.globalpayex.day_6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.globalpayex.college.entities.Student;

public class streamFindStudents {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("Mehul", 'm', 1805393, 89f),
				new Student("Kush", 'm', 993, 69f),
				new Student("xyz", 'f', 4, 66f),
				new Student("abc", 'f', 2, 77f),
				new Student("Issant", 'm', 222, 99f)
			);
		
		double avg = list.stream()
			.collect(Collectors.averagingDouble(student -> student.marks));

//		DoubleSummaryStatistics ds = list.stream()
//				.collect(Collectors.summarizingDouble(student -> student.marks));
		
		System.out.println("The average marks is " + avg);
		
		
		System.out.println();
		
		//group all the students by gender
		Map<Character, List<Student>> map = list.stream()
			.collect(Collectors.groupingBy(stu -> stu.gender));
		
		System.out.println(map);
		
		//from the student list 
		/*
		 * find who scored greater equal to 80 marks
		 * who less than 80 marks
		 */
		
		Map<Boolean, List<Student>> marksMap = list.stream()
			.collect(Collectors.partitioningBy(stu -> stu.marks >= 80));
		
		System.out.println(marksMap);
		
		// System.out.println("payex");
	}

}
