//import com.abc.salary.SalariedCalculator;
import com.abc.salary.SalariedCalculator;
import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;

public class RunCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Kaushik Mandal", 'M', 393, 80f);
		
		String subArr[] = {"Java", "DBMS"};
//		Professor p1 = new Professor("Mehul Chopra", 'M', subArr);
		Professor p1 = new Professor("Mehul Chopra", 'M', 1000, 24, subArr);
		
		/*
		System.out.println(s1.name);
		System.out.println(s1.gender);
		
		System.out.println(p1.name);
		System.out.println(p1.gender);
		*/
		
//		System.out.println(s1.getDetails());
		/*
		 * Internally of getDetails() ->
		 * Student.getDetails(s1);
		 */
//		System.out.println(p1.getDetails());
		
		// For only Student class
//		System.out.println(s1.getDetails());
		
//		System.out.println(s1);
		System.out.println(p1);
		
//		SalariedCalculator sc = new SalariedCalculator();
		System.out.println(SalariedCalculator.calculate(p1));
		
		System.out.println(p1.calculate());
	}

}
