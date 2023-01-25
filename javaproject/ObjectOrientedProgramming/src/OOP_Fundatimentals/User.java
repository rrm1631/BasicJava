package OOP_Fundatimentals;

public class User {
	
	private int userID;
	private String username, fname, lname;	

	public User(int userID, String username, String fname, String lname) {
		this.userID = userID;
		this.username = username;
		this.fname = fname;
		this.lname = lname;
	}
	
	//GETTERS
	public int getUsers() {
		return this.userID;
	}
	
	//SETTERS
	public void setUsers(int userID) {
		this.userID = userID;
	}
}
