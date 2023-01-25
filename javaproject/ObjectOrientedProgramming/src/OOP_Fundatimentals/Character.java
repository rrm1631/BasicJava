package OOP_Fundatimentals;

public class Character {
	
	String name, dialog;
	int hp, mp, lvl;
	
	public Character(String name, String dialog, int hp, int mp, int lvl) {
		this.name = name;
		this.dialog = dialog;
		this.hp = hp;
		this.mp = mp;
		this.lvl = lvl;
	}
	
	public void introduce() {
		System.out.println("Character Name: " + name);
	}
	
	public void sayDialog() {
		System.out.println(dialog);
	}

}
