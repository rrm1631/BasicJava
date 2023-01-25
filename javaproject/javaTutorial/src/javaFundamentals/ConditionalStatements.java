package javaFundamentals;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 

		boolean isVerified = true;
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		
		if(age >= 18) {
			System.out.println("Access Granted");
			
			//Nested Condition
			if(isVerified) {
				System.out.println("You are Qualified");
			}
		}
		
		else if((age >= 13) ) {
			System.out.println("Parental Consent Required");
		}
		
		else {
			System.out.println("Access Denied");
		}
		
	}

}
