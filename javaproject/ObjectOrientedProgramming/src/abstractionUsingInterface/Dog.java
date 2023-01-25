package abstractionUsingInterface;

public class Dog implements Animal, LandAnimal{
	
	//makeSound() is an abstract method of Animal
	public void makeSound() {
		System.out.println("Woof.. Woof..");
	}
	
	public void walk() {
		System.out.println("Dog Walk");
	}
	
	public void bark() {
		System.out.println("bark");
	}
}
