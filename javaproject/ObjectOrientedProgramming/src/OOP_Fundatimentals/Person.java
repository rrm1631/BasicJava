package OOP_Fundatimentals;

public class Person {
	//note: since Person() is used in the same package, you don't need to set its attributes modifier to public
	String firstName;
	String lastName;
	char gender;
	int age;
	
	public Person(String firstName, String lastName, char gender, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age);
	}
}
