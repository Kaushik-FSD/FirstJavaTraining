package com.globalpayex.day_4.banking;

import com.globalpayex.day_4.exception.MinBalNotMaintainedException;

public class Account {
	
	String accountNumber;
	double balance;
	String accountType;
	
	public Account(String accountNumber, double balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public double deposit(int amount) {
		this.balance += amount;
		return this.balance;
	}
	
	public double withdraw(int amount) throws MinBalNotMaintainedException {
		
		try {
			if(amount <= 0) {
				throw new IllegalArgumentException("The withdrawl amount can not be less than or equal to zero");
			}
			
			if(this.balance - amount < 1000) {
				//throw an exception
//				throw new IllegalStateException("Balance can't go below 1000"); //the code returns from here itself
				
				throw new MinBalNotMaintainedException("Balance can't go below 1000");
			}
			
			this.balance -= amount;
			return this.balance;
		}finally {
			System.out.println("**********Transaction Ends**********");
		}
		
	}

}
