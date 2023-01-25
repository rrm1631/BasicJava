package challenge;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Student Number: ");
		int studID = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Fullname: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Course: ");
		String course = sc.nextLine();
		
		System.out.print("Enter Section: ");
		String section = sc.nextLine();
		
		Student stud = new Student(studID, name, course, section);
		
		stud.introduceSelf();
		
	}

}
