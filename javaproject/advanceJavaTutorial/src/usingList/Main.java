package usingList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <Student> stud = new ArrayList<>();
		
		stud.add(new Student("Mario", 16, "Rizal"));
		stud.add(new Student("Luigi", 15, "Bonifacio"));
		stud.add(new Student("Yoshi", 12, "Aguinaldo"));
		
//		stud.forEach(s -> System.out.println(s.getName()));
		
		ArrayList<Student> stud1 = new ArrayList<Student>();
		stud1.add(new Student("Ryu", 16, "Rizal"));
		stud1.add(new Student("Goku", 16, "Rizal"));
		stud1.add(new Student("Ichigo", 16, "Rizal"));
		
		for(Student s: stud1) {
			System.out.println(s.getName());
		}
	}

}
