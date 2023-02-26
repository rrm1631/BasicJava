package usingGenerics;

public class main {
	
	//Generic Method
	public static <T> void genericMethod(T toSay) {
		System.out.println(toSay);	
	}
	
	public static <T, V> void genericMethod2(T toSay, V otherToSay) {
		System.out.println(toSay);	
		System.out.println(otherToSay);	
	}
	
	
	public static void main(String[] args) {
		GenericPrinter<String> name = new GenericPrinter<>("Raph");
		GenericPrinter<Integer> age = new GenericPrinter<>(23);
		GenericPrinter<Double> salary = new GenericPrinter<>(700.00);
		
		name.print();
		age.print();
		salary.print();

		genericMethod("Awitized");
		genericMethod(123.23);
		genericMethod2("Lebron", 23);
	}

}
