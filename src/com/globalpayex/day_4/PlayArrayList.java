package com.globalpayex.day_4;

import java.util.ArrayList;

public class PlayArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cars = new ArrayList<>();
		cars.add("MG");
		cars.add("BMW");
		
		System.out.println(cars);
		
		cars.add(1, "Lambo");
		
		System.out.println(cars);
		
		for(String ele: cars) {
			System.out.println(ele);
		}
	}

}
