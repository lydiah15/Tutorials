// Java Database Connectivity JDBC
// Create database
import java.sql.*;
public class Sample77 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Register DB driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish Database connection(url, user, password)
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=UTC", "root", "lydiah15");
		// Create a Statement
		Statement st = conn.createStatement();
		// Execute a Statement
		st.execute("create database muyatiffany");
		// Close Statement and Connection 
		st.close();
		conn.close();
		
	}

}
