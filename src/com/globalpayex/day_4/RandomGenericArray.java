package com.globalpayex.day_4;

import java.util.Random;

public class RandomGenericArray {

	static <T> T randmElement(T[] arr) {
		Random r = new Random();
		int idx = r.nextInt(arr.length);
		return arr[idx];
	}
	
	public static void main(String[] args) {
//		Generic works with reference type only and not primitive type
		Integer arr[] = {1,2,3,4,5};
		int n = randmElement(arr);
		System.out.println(n);
	}

}
