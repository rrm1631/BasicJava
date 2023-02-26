package usingAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String names[] = {"Ryu", "Conan", "Ash"};
		
		List stringNames = Arrays.asList(names);
		stringNames.forEach(n -> System.out.println(n));
		
		
		//Arrays.asList() in Objects
		List<Topic> topic = Arrays.asList(
					new Topic("Games", "Mario Cart", "Mario Cart Controlls")
				);

		System.out.println(topic.get(0).getName());
		
		//ArrayList<> Arrays.asList() in Objects
		List<Student> student = new ArrayList<>(Arrays.asList(
					new Student("Mario", 16, "Rizal")
				));
		
		System.out.println(student.get(0).getName());
	}

}
