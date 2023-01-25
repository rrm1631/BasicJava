package abstractionUsingInterface;

public class Bird implements Animal, AirAnimal{

	public void makeSound() {
		System.out.println("Chirp...");
	}
	
	public void fly() {
		System.out.println("Bird Fly");
	}
}
