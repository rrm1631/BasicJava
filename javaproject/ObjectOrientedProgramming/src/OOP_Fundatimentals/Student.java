package OOP_Fundatimentals;

public class Student {

	String Fullname, Course;
	char Section;
	int Year;
	
	public Student(String name, String Course, char Section, int Year) {
		this.Fullname = name;
		this.Course = Course;
		this.Section = Section;
		this.Year = Year;
	}
	
	public void introduceSelf() {
		System.out.println("Name: " + this.Fullname);
		System.out.println("Course: " + this.Course);
		System.out.println("Section: " + this.Section);
		System.out.println("Year: " + this.Year);
	}
	
	public void evaluateGrade(double midterms, double finals) {
		double avg = (midterms + finals)/2;
		
		if(avg >= 98  && avg <= 100) {
			System.out.println("Grade: " + avg);
			System.out.println("Standing: With Highest Honors");
		}
		
		else if(avg >= 95 && avg <= 97.99) {
			System.out.println("Grade: " + avg);
			System.out.println("Standing: With High Honors");
		}
		
		else if(avg >= 90 && avg <= 94.99) {
			System.out.println("Grade: " + avg);
			System.out.println("Standing: With Honors");
		}
		
		else if(avg >= 75 && avg <= 89.99) {
			System.out.println("Grade: " + avg);
			System.out.println("Standing: Passed");
		}
		
		else if(avg < 75) {
			System.out.println("Grade: " + avg);
			System.out.println("Standing: Failed");
		}
		
		else {
			System.out.println("Invalid Grade");
		}
	}
	
}
