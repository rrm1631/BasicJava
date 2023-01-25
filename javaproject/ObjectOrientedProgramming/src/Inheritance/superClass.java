package Inheritance;

public class superClass {

	String name;
	char gender;
	int age;
	
	public superClass(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void checkStatus() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
	}
}
