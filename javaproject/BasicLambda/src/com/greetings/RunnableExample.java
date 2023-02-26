package com.greetings;

public class RunnableExample {
	
	public static void main(String[] args) {
		
		//Basic Thread
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
			
		});
		
		myThread.run();
		
		
		//Thread using Lambda
		Thread myLambdaThread = new Thread(()->System.out.println("Printed inside Lambda Runnable"));
		myLambdaThread.run();
	}

}
