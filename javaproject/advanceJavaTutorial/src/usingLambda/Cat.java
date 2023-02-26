package usingLambda;

public class Cat implements Printable {
	
	public String name;
	public int age;
	
	public Cat() {
		
	}

	@Override
	public void goPrint() {
		System.out.println("Meow");
	}

	@Override
	public void newPrint(String word) {
	
	}

	
}
