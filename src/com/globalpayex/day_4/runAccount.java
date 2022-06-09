package com.globalpayex.day_4;

import com.globalpayex.day_4.banking.Account;
import com.globalpayex.day_4.exception.MinBalNotMaintainedException;

public class runAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("1111100000", 1000, "Savings");
	
		System.out.println("Current Balance: " + account.deposit(1000));	
		
//		try {
//			System.out.println("Current Balance: " + account.withdraw(-200));
//		}catch(IllegalStateException e) {
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}catch(IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			System.out.println("Current Balance: " + account.withdraw(5000));
		} catch (MinBalNotMaintainedException e) {
			System.out.println(e.getMessage());
		}
	}

}
