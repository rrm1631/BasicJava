package ImportPackages;

//Import Packages
import toImport.*;

public class main {

	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		
		int sum = a.add(2, 4);
		// int sum = Arithmetic.add(2, 2); //note: you can directly call a static method without instantiation
		
		System.out.println(sum);
		
		Constants c = new Constants();
		System.out.println(c.pi);
	}

}
