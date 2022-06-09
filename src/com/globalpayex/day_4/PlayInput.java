package com.globalpayex.day_4;

import java.util.*;

public class PlayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number n: ");
		
		try {
			int n = sc.nextInt();			
			System.out.println(n%2 == 0 ? "Even number" : "Odd number");
		}catch(InputMismatchException e) {
			System.out.println("Please enter only INTEGER values...");
		}
		
		System.out.println("Program ended");
		sc.close();
	}

}

/*
account class
acc no
acc type
balance

withdraw()
deposit()

return updated balance after withdraw and deposit call
*/