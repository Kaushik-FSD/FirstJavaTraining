package com.globalpayex.day_5;

import java.util.*;
import java.util.stream.*;

public class ListOperations {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6, 6,7,8,9,10);
		
		//create a new list consisting of odd numbers more than the value 3 from the list list
		//and print it.
		
		//CONVENTIONAL LOGIC
//		List<Integer> newList = new ArrayList<>();
//		
//		for(int ele: list) {
//			if(ele%2 != 0 && ele > 3) {
//				newList.add(ele);
//			}
//		}
//		
//		System.out.println(newList);
		//***********************************
		
		//STREAM API's
		
		Stream<Integer> stream = list.stream();
		List<Integer> odds = stream
				.filter(ele -> ele%2 != 0 && ele > 3)
				.collect(Collectors.toList());
		
		System.out.println(odds);
	
		//************************************
		
//		//source data
//		int arr[] = {4,6,5,9,10,3,4,8};
//		IntStream intStream = Arrays.stream(arr);
//		
//		//empty stream
//		Stream stream1 = Stream.empty();
		
		
		//create a new String consisting of even numbers more than the value 2 from the list list
		//and print it.
		String s = list.stream()
			.filter(ele -> ele%2 == 0 && ele > 2)
			.map(ele -> ele.toString())
			.collect(Collectors.joining(","));
		
		System.out.println(s);
		
//		**************************************************
		
		List<Integer> ans = list.stream()
			.filter(ele -> ele > 4)
			.distinct()
			.map(ele ->  ele*ele)
//			.sorted((o1, o2) -> o2.compareTo(o1))
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
		
		System.out.println(ans);
		
	}
}
