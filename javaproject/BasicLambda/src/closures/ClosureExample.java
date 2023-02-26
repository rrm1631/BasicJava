package closures;

public class ClosureExample {
	
	interface Process{
		void process(int i);
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//the variable b, cannot be overridden for it is considered as final when called in another interface
		doProcess(a, (i)-> System.out.println(i + b));
	}

}
