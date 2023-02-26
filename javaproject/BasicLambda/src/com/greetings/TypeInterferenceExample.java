package com.greetings;

public class TypeInterferenceExample {
	
	interface StringLengthLambda {
		int someFunction(String s);
	}

	public static void main(String[] args) {
		StringLengthLambda myLambda = (String s)-> s.length();
		System.out.println(myLambda.someFunction("Hello"));
	}

}
