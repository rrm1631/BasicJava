package javaFundamentals;

public class LoopStatement {

	public static void main(String[] args) {
		
		
		String names[] = {"Raphael", "Mario", "Luigi", "Yoshi", "Wario"};
		int i = 0;
		
		//While loop
		while (i < names.length) {
			System.out.println(names[i]);
			i++;
		}
		
		
		
		
		
		//Do While lopp
		int x = 0;
		
		do {
			System.out.print(x + " ");
			x++;
		} while(x < 5);
	
		
		System.out.println();
		
		
		
		
		
		
		//For loop
		for(int y=0; y<5; y++) {
			System.out.print(y + " ");
		}
		
		System.out.println();
		
		
		
		
		//For each Loop
		int numbers[] = {10,20,30,40}; 
		int sum = 0;
		for(int num : numbers) { //for(datatype varname/identifier : array/collection){}
			sum += num;
		}
		
		System.out.print("Sum: " + sum);
		
	}

}
