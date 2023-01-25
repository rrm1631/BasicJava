package Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		//Typical instantiate 
//		Animal a = new Animal();
//		Dog d = new Dog();
//		Cat c = new Cat();
//
//		a.makeSound();
//		d.makeSound();
//		c.makeSound();
		
		
		//Polymorphism
		Animal dog = new Dog();
		Animal cat = new Cat();
		//Note: you can use the superClass that extends the subClass to instantiate the object
		
		dog.makeSound();
		cat.makeSound();
		
		
		Enemy strong = new WeakEnemy();
		Enemy weak = new StrongEnemy();		
		
		strong.dialog();
		strong.showStats();
		
		System.out.println();
		
		weak.dialog();
		weak.showStats();
	}

}
