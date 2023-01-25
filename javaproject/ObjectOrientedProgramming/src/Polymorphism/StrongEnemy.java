package Polymorphism;

public class StrongEnemy extends Enemy{
	
	StrongEnemy(){
		name = "Strong Enemey";
		hp = 100;
	}
	
	public void dialog() {
		System.out.println("Level 45");
	}
}
