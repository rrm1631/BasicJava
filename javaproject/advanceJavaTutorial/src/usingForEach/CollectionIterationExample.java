package usingForEach;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
			);
		
		System.out.println("Using For Loop");
		for(int i=0; i<people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("\nUsing For In");
		for(Person p : people) {
			System.out.println(p);
		}
		
		//forEach method takes in 1 argument which is a consumer. Consumer is a functional interface
		System.out.println("\nUsing ForEach");
		people.forEach((p)->System.out.println(p));
	}

}
