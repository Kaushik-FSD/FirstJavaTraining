package Advance;

public class PowerFuncton {
	
	static int nextGenAdd(int... num) { 
//		variance -> takes multiple parameters
//		(it is same as spread operator in JS)
		int sum = 0;
		
		
		for(int ele: num) {
			sum += ele;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println(nextGenAdd());
		System.out.println(nextGenAdd(1,2));
		System.out.println(nextGenAdd(1,4,2));
		System.out.println(nextGenAdd(1,6,3,8,9,99,4));
	}

}
