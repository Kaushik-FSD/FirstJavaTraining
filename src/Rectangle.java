
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1 = 4;
		int l2 = 5;
		
		int peri = findPerimeter(l1, l2);
		System.out.println(peri);
	}
	
	public static int findPerimeter(int l1, int l2) {
		return 2 * (l1 + l2);
		
	}

}
