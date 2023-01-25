package abstractionUsingAbstract;

public abstract class Animal {
	
	String name;

//	public void makeSound() {
//		System.out.println("Animal Sounds...");
//	}
	
	//abstract method
	public abstract void makeSound(); //no body
	
	
	public void showName() {
		System.out.println("Name 	: " + this.name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
