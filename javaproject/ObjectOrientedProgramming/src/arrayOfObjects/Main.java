package arrayOfObjects;

public class Main {

	public static void main(String[] args) {
		//Typhical Instantiation
		Employee e = new Employee("Raph", "Mallari", "Web Dev");
		
		//Using Array of Objects
		Employee employees[] = new Employee[2];
		
		employees[0] = new Employee("Mario", "Bro", "Plumber");
		employees[1] = new Employee("Luigi", "Bro", "Plumber");
		
		//For loop
//		for(int i=0; i < employees.length; i++) {
//			System.out.println("Hello, " + employees[i].firstName());
//			employees[i].introduceSelf();
//			System.out.println();
//		}
		
		//For Each
		for(Employee emp: employees) {
			emp.introduceSelf();
		}
	}

}
