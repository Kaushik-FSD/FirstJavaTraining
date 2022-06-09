package com.globalpayex.day_4.wrapperTutorial;

public class useNextGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] arr = {"audi", "bmw", "lambo", "mercedes"};
//		NextGenArray obj = new NextGenArray(arr);
//		
//		System.out.println(obj.get(1));
//		obj.set(1, "MG");
//		System.out.println(obj.get(1));
//		System.out.println(obj.toString());
		
		
		Integer[] array = {1,2,3,4,5};
		NextGenArray<Integer> nga = new NextGenArray<Integer>(array);
		
		System.out.println(nga.get(1));
		nga.set(1, 10);
		System.out.println(nga.get(1));
		System.out.println(nga.toString());
	}

}
