package com.globalpayex.day_4.exception;

//COMPILER CHECKED EXCEPTION

@SuppressWarnings("serial")
public class MinBalNotMaintainedException extends Exception{
	
	public MinBalNotMaintainedException(String msg) {
		super(msg);
	}
}
