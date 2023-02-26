package usingGenerics;

public class GenericPrinter <T>{ // T stands for Type
	
	private T thingToPrint; //similar to an object attribute ex. public String name;

	//Constructor
	public GenericPrinter(T somethingToPrint) {
		this.thingToPrint = somethingToPrint;
	}
	
	public void print() {
		System.out.println(thingToPrint);
	}
	
}
