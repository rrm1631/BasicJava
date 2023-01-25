package challenge;

public class Student {
	
	private int studID;
	String name;
	String course, section;
	

	public Student(int studID, String name, String course, String section) {
		this.studID = studID;
		this.name = name;
		this.course = course;
		this.section = section;
	}
	
	public void introduceSelf() {
		System.out.println(); 
		System.out.println("Student ID: " + this.studID);
		System.out.println("Name: " + this.name);
		System.out.println("Course: " + this.course);
		System.out.println("Section: " + this.section);
	}
	
	
}
