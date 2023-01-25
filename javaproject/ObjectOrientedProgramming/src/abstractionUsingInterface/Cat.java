package abstractionUsingInterface;

public class Cat implements Animal, LandAnimal{

	//makeSound() is an abstract method of Animal
	public void makeSound() {
		System.out.println("Meoww...");
	}
	
	public void walk() {
		System.out.println("Cat Walk");
	}
	
	public void scratch() {
		System.out.println("scratch");
	}
}
