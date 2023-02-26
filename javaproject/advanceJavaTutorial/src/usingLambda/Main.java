package usingLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	static void printThing(Printable thing) {
		thing.goPrint();
	}
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
//		c.goPrint();
		printThing(c);
		
		int numbers[] = {1,2,3,4,5};
		List numberList = Arrays.asList(numbers);
	
		
		String[] stringArray = new String[] { "A", "B", "C", "D" };
		List stringList = Arrays.asList(stringArray);
		stringList.forEach(s -> System.out.println(s));
		
		 
	}

}
