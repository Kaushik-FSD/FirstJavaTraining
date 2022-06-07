
public class getDataAll {

	public static void main(String[] args) {
		int marks = 75;
		String data = getDetails("Kaushik", 'M', 1805393, marks);
		System.out.println(data);
		
		String grade = findGrade(marks);
		System.out.println("Grade is " + grade);
	}
	
	static String getDetails(String name, char gender, int roll, int marks) {
		String str = "";
		str = "Name: " + name + '\n' + "Gender: " + gender + '\n' 
				+ "Roll: " + roll + '\n' + "Marks: " + marks;
		
		return str;
	}
	
	static String findGrade(int mark) {
		
		if(mark < 0 || mark >100) {
			return "I";
		}
		
		if(mark >= 70) {
			return "A";
		}else if(mark >= 60 && mark < 70) {
			return "B";
		}else if(mark >= 40 && mark < 60) {
			return "C";
		}else {
			return "F";
		}
	}

}
