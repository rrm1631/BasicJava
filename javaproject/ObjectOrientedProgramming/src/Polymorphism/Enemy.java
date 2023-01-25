package Polymorphism;

public class Enemy {
	
	String name = "Weak Enemey";
	int hp = 25;
	
	public void dialog() {
		System.out.println("Dialog...");
	}
	
	public void showStats() {
		System.out.println("Name	: " + name);
		System.out.println("HP		: " + hp);
	}
}
