package learnENUM;

public enum Currency {
	
	ONE(1), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), ONEHUNDRED(100); 
	
	double val;
	
	private Currency(double val) {
		this.val = val;
	}
}
