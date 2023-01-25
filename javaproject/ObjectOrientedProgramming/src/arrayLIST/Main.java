package arrayLIST;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		//ADDING VALUES
		
			//STring
			ArrayList<String> names = new ArrayList<String>(); 
			names.add("Mario");
			names.add("Luigi");
			names.add("Yoshi");
			
			//Integers
			ArrayList<Integer> numbers = new ArrayList<Integer>(); 
			numbers.add(1);
			numbers.add(2);
			numbers.add(3);
			
			//Objects
			ArrayList<Student> students = new ArrayList<Student>(); 
			Student stud1 = new  Student("Raphael", "BSIT");
			students.add(stud1);
			//OR
			students.add(new Student("Raph", "BSIT")); 
		
		
		//READ VALUES
		System.out.println(names.get(0));
		students.get(0).introduce();
		
		
		//UPDATE VALUES
		names.set(0, "Fake Mario");
		students.set(0, new Student("Raph2", "CSCS"));
		
		
		//DELETE VALUES
		String removed = names.remove(0);
		numbers.clear();
		
		System.out.println(removed + " has been removed..");
		System.out.println(numbers);
		
		
		//Iterating ArrayList
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println("#"+ i + " " + names.get(i));
		}
		
		for(String name: names) {
			System.out.println(name);
		}
		
		
	}

}
