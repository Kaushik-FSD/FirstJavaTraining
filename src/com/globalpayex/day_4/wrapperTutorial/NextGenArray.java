package com.globalpayex.day_4.wrapperTutorial;

public class NextGenArray<T> {
	T[] ele;

	public NextGenArray(T[] ele) {
		super();
		this.ele = ele;
	}
	
	public T get(int index) {
		return this.ele[index-1];
	}
	
	public void set(int index, T element) {
		this.ele[index-1] = element;
	}

	@Override
	public String toString() {
		String res = "";
		for(int i = 0; i<ele.length; i++) {
			res += ele[i];
			
			if(i != ele.length - 1) {
				res += ",";
			}
		}
		
		return res;
	}
	
	
}
