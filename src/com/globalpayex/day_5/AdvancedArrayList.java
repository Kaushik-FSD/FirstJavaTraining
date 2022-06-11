package com.globalpayex.day_5;

import java.util.*;

public class AdvancedArrayList {

	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(4,1,6,5,8,7,5,6,8);
		System.out.println(arr);
		System.out.println(arr.getClass());
		
		//to print all the numbers from the arr list without explicitly using for loop
		arr.forEach(ele -> System.out.println(ele));
		
		System.out.println("************************printing even numbers:");
		//to print all the even numbers from the arr list without explicitly using a loop
		arr.forEach(ele -> {
			if(ele%2 == 0)
				System.out.println(ele);
		});

		//METHOD REFERENCES
		System.out.println("************************printing all numbers(using method references):");
		arr.forEach(System.out::println);
		
//		HashSet<Integer> hs = new HashSet<>(arr);
	}

}
