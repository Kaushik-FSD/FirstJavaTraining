import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.globalpayex.college.entities.Address;
import com.globalpayex.college.entities.Student;

public class findStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = Arrays.asList(
				new Student("Mehul", 'm', 1805393, 89f, new Address("1", "India", "Assam")),
				new Student("Kush", 'm', 993, 99f, new Address("2", "USA", "CA")),
				new Student("xyz", 'f', 4, 66f, new Address("2", "UK", "LND")),
				new Student("abc", 'f', 2, 77f, new Address("3", "USA", "SF")),
				new Student("Issant", 'm', 222, 99f, new Address("4", "USA", "SD")),
				new Student("Jane", 'm', 333, 99f)
			);
		
		String s = list.stream()
				.filter(ele -> ele.marks > 80)
				.map(ele -> ele.name)
				.collect(Collectors.joining(","));
		
		// System.out.println(s);

		String usaAdd = list.stream()
			.filter(ele -> ele.isAddressPresent() && ele.getAddress().getCountry().equals("USA"))
			.map(ele -> ele.name)
			.collect(Collectors.joining(","));

		System.out.println(usaAdd);
	}

}
