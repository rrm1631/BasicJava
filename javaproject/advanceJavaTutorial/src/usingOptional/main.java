package usingOptional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import usingAsList.Topic;

public class main {	
	
	public static List<Cat> cat = new  ArrayList <> (Arrays.asList(
			 new Cat("Cat1", 1),
			 new Cat("Cat2", 2),
			 new Cat("Cat3", 3)
		));
	
	public static Optional<Cat> findCatByName(String name) {
		return Optional.ofNullable(cat.stream().filter( c -> c.getName().equals(name)).findFirst().get());
	}

	public static void main(String[] args) {
		
		Optional<Cat> myCat = findCatByName("Cat1");
		
		if(myCat.isPresent()) {
			String catName = myCat.get().getName();
			System.out.println(catName + " is available");
		} else {
			System.out.println("Cat is not available");
		}
		
	}
		
}
