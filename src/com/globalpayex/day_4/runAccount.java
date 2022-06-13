package com.globalpayex.day_4;

import com.globalpayex.day_4.banking.Account;
import com.globalpayex.day_4.exception.MinBalNotMaintainedException;

public class runAccount {

	public static void main(String[] args) {
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

		//CALLING THE OPTIONAL METHOD
		Account account1 = new Account(null, 0, null);

		// account1.getDetails()
		// 	.ifPresent(details -> System.out.println(details.toUpperCase()));

		account1.getDetails()
			.ifPresentOrElse(details -> System.out.println(details.toUpperCase()),  //it is the if part
			() -> System.out.println("Account not initialized")); //it is the else part


		//GETTER ANS SETTER
		try{
			account1.setAccountType("Savings");
			account1.setAccountNumber("1111100000");
			account1.setBalance(-100);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			System.exit(0);
		}

		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getAccountType());
		System.out.println(account1.getBalance());
	}

}
