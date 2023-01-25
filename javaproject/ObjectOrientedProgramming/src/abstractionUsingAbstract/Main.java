package abstractionUsingAbstract;



public class Main {

	public static void main(String[] args) {
		//ABSTRACT IDEA
//		Animal a = new Animal();
		
		//CONCRETE IDEA
		Animal c = new Cat();
		Animal d = new Dog();
		
		c.makeSound();
		d.makeSound();
		
		c.setName("Catt");
		d.setName("Douge");
		
		c.showName();
		d.showName();

	}

}
