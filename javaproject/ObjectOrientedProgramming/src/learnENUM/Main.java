package learnENUM;

public class Main {
	
	public static void main(String[] args) {
		//USING ENUMS
		AILevel level = AILevel.HARD;
		System.out.println(level);
		
		
		//Enums in Conditional Statement
		if(level == AILevel.HARD) {
			System.out.println("this is HARD");
		} 
		
		else if(level == AILevel.MEDIUM) {
			System.out.println("this is MEDIUM");
		}
		
		else if(level == AILevel.HARD){
			System.out.println("this is EASY");
		}
		
		
		//Enums w/ Value
		Currency money = Currency.FIFTY;
		System.out.println("php " + money.val);
	}
}
