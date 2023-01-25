package javaFundamentals;

import java.util.Scanner;

public class UserInputs {
	
	public static void main(String[] args) {
			//Handling User Inputs
			Scanner scan = new Scanner(System.in); 
			
			System.out.print("Enter 1st Number: ");
			int x = scan.nextInt();
			
			System.out.print("Enter 2nd Number: ");
			int y = scan.nextInt();
			
			System.out.println("Sum: " + (x + y));
	}
}
