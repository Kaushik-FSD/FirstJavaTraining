
public class printEven {

	public static void main(String[] args) {
		int num = 10;
		String res = printEvenNumbers(num);
		System.out.println(res);
	}
	
	static String printEvenNumbers(int num) {
		String str = "";
//		for(int i = 1; i<=num; i++) {
//			if(i % 2 == 0) {
//				str += i;
//				if(i != num) 
//					str = str + " ";
//			}
//		}
		
		int i = 1;
		while(i <= num) {
			if(i % 2 == 0) {
				str += i;
				if(i != num) 
					str = str + " ";
			}
			i++;
		}
		
		return str;
	}

}
