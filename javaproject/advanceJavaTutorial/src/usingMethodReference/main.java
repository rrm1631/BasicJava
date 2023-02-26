package usingMethodReference;

public class main {
	
	public static void printMessage() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Thread t = new Thread(main::printMessage);
		t.start();		
	}

}
