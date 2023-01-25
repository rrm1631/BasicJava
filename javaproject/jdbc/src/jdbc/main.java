package jdbc;

import java.sql.*;
import java.util.Iterator;

public class main {

	public static void main(String[] args) throws SQLException{
		
		//Establishing a connection
		String url = "jdbc:mysql://localhost/university";
		String user = "root";
		String pass = "";
		String query = "SELECT * FROM students";
		
		//Checks if connection is ready and working
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		//Creates a connection to the database
		try {
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				String UniversityData = "";
				
				//from column 1 - 6
				for (int i = 1; i <= 6; i++) {
					UniversityData += result.getString(i) + ":";
				}
				
				System.out.println(UniversityData);
			}
			
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
