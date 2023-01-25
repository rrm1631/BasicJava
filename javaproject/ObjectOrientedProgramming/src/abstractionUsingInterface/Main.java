package abstractionUsingInterface;

public class Main {

	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		Bird b = new Bird();
		
		c.makeSound();
		d.makeSound();
		b.fly();

	}

}
