package com.globalpayex.day_4.banking;
import java.util.Optional;

import com.globalpayex.day_4.exception.MinBalNotMaintainedException;

public class Account {
	
	private String accountNumber;
	private double balance;
	private String accountType;
	
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

	// public String getDetails(){
	// 	if(accountNumber != null && !accountNumber.equals("") && accountType != null
	// 	&& !accountType.equals("")){
	// 		return String.format("Acc no: %s\nAcc Type: %s\nBalance: %s", accountNumber, accountType, balance);
	// 	}

	// 	return null;
	// }


	//RATHER THAN RETURNING NULL AND MAKING THE LIFE A HELL OF DEVELOPER USE OPTIONAL
	public Optional<String> getDetails(){
		if(accountNumber != null && !accountNumber.equals("") && accountType != null
		&& !accountType.equals("")){
			return Optional.of(String.format("Acc no: %s\nAcc Type: %s\nBalance: %s", accountNumber, accountType, balance));
		}

		return Optional.empty();
	}

	public void setAccountType(String accountType) {
		if(accountType.equals("Savings") || accountType.equals("Current"))
			this.accountType = accountType;
		else
			throw new IllegalArgumentException("Account type must be one of the following: (Savings or Current)");
	}

	public String getAccountType() {
		return accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		// this.balance = balance;
		if(balance >=1000){
			this.balance = balance;
		}else
			throw new IllegalArgumentException("The minimum deposit should be 1000");
	}

	

	
}
