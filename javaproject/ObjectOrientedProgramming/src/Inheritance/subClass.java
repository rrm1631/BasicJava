package Inheritance;

public class subClass extends superClass{
	
	String contact;
	
	public subClass(String name, char gender, int age, String contact) { //constructor
		super(name, gender, age); //calls the constructor of the superclass
		
		this.contact = contact;
	}
	
	//Overriding Methods from superclass using super
	public void checkStatus() {
		super.checkStatus(); //will call the functionality from the superclass method
		System.out.println("Contact: " + this.contact);
	}
}
