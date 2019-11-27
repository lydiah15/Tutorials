//JDBC ---- creating a database---
import java.sql.*;
public class Sample79 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=UTC", "root", "lydiah15");
		Statement st = conn.createStatement();
		st.execute("create database surya");
		st.close();
		conn.close();
	}

}
