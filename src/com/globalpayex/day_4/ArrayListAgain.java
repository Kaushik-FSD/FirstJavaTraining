package com.globalpayex.day_4;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		//inner class
		class DescendingComparator2 implements Comparator<Integer>{
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		}
		
		
		System.out.println(arr);
		
		//using external class
		arr.sort(new DescendingComparator());
//		***************************************************************
		
		//using inner class
		arr.sort(new DescendingComparator2());

//		***************************************************************
		
		//anonymous inner class
		arr.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});

//		***************************************************************
		
		//Lambda expression -> is used to pass a function in a function (which was not doable 
//		before and thus reducing lines of code and as we can see above we can reduce the use of anonomous function)
		
		arr.sort((o1, o2) -> o2.compareTo(o1));

		
		System.out.println(arr);
	}

}
