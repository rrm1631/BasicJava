package javaFundamentals;

public class Methods {
	
	//global variables
	static String name = "Mario";
	
	//Return Type - basically all the data types
//	1.void - returns Nothing
//	2.int - returns integers
//	3.String - return Strings
	
	static void sayHello(String name) {
		System.out.println("Hello, " + name);
	}
	
	static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	static int summation(int numbers[]) {
		int sum = 0;
		
		for(int number: numbers) {
			sum += number;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		sayHello(name);
		System.out.println("Sum: " + add(2, 2));
		
		int numbers[] = {1,2,3,4,5};
		System.out.println("Summation: " + summation(numbers));
	}

}
