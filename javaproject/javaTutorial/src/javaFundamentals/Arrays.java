package javaFundamentals;

public class Arrays {

	public static void main(String[] args) {
		// array with values
		String studentNames[] = {"Raphael", "Mario", "Luigi", "Yoshi"};
		
		// array without values
		double grades[] = new double[4];
		grades[0] = 3.45;
		grades[1] = 3.45;
		grades[2] = 3.45;
		grades[3] = 3.45;
		
		System.out.println("Name: " + studentNames[0] + "\n" + "GPA: " + grades[0]);
	}

}
