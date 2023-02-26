package com.greetings;

import java.util.ArrayList;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	interface myFunction {
		void someFunction();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.greet(() -> System.out.println("Passed Directly Through a method"));
	
		//Instance
		HelloWorldGreeting hwg = new HelloWorldGreeting();
		hwg.perform();

		//Lambda Expression
		Greeting lambdaGreeting = () -> System.out.println("Lambda: Hello World!");
		lambdaGreeting.perform();
		
		//Anonymous Inner Class
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Inner Class");
			}
		};
		
		innerClassGreeting.perform();
	
		
	}
}

