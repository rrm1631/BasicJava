package com.greetings;

public class HelloWorldGreeting implements Greeting{
	
	Greeting g1 = ()->{System.out.println("Hello World Greeting");};

	@Override
	public void perform() {
		g1.perform();
	}



}
