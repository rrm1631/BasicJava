package arrayLIST;

public class Student {
	String name, course;
	
	Student(String name, String course){
		this.name = name;
		this.course = course;
	}
	
	public void introduce() {
		System.out.println("Name		: " + this.name);
		System.out.println("Course		: " + this.course);
	}
}
