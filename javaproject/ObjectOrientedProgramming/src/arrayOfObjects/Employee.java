package arrayOfObjects;

public class Employee {
	String fname, lname;
	String jobTitle;
	
	public Employee(String fname, String lname, String jobTitle) {
		this.fname = fname;
		this.lname = lname;
		this.jobTitle = jobTitle;
	}
	
	public void introduceSelf() {
		System.out.println("Name: " + this.fname + " " + this.lname);
		System.out.println("Job Title: " + this.jobTitle);
	}
	
	public String firstName() {
		return this.fname;
	}
	

}
