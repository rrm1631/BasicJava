package OOP_Fundatimentals;

public class Product {
	
	String name;
	double price;
	
	public Product(String name, double price) { //constructors are named after their classname
		
		this.name = name; 
		this.price = price;
		
		System.out.println("Product Name: " + name);
		System.out.println("Product Price: " + price);
		
	}
	
}
