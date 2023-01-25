package Polymorphism;

public class WeakEnemy extends Enemy{
	
	public WeakEnemy() {
		name = "Weak Enemey";
		hp = 25;
	}
	
	public void dialog() {
		System.out.println("Level 1");
	}
}
