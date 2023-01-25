package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		//Inheritance
		superClass sup = new superClass("Raph", 'M', 23); //Parent
		subClass sub = new subClass("Mona", 'F', 22, "09876543210"); //Child
		
		sup.checkStatus();
		System.out.println();
		sub.checkStatus();
		
	}

}
