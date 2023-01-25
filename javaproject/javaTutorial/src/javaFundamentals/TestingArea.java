package javaFundamentals;

import java.util.*;

public class TestingArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Hello: ");
		String hello = scan.nextLine();
		
		if(hello.equals("Hello")) {
			System.out.println("Hi There");
		}
	}

}
