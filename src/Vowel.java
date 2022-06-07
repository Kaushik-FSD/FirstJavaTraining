
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char character = 'E';
		boolean res = isVowel(character);
		
		if(res)
			System.out.println("Is is vowel");
		else
			System.out.println("it is not vowel");
	}
	
	//conventional switch case
	static boolean isVowel(char character) {
		
		switch (character) {
		  case 'A':
//			  return true;
		  case 'E':
//			  return true;
		  case 'I':
//			  return true;  
		  case 'O':
//			  return true;
		  case 'U':
			  return true;
		  default:
			  return false;
		}
	}
	
	//switch expression 
//	static boolean isVowel2(char character) {
//		
//		return switch(character) {
//			case 'A', 'E', 'I', 'O', 'U' -> true;
//			default -> false;
//		};
//	}
	
}
