// Create a table for database muyatiffany
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample78 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		// Register DB driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish Database connection(url, user, password)
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		// Create a statement
		Statement st = conn.createStatement();
		// Execute a statement
		st.execute("create table employee(empno int, empname varchar(15),empsal int)");
		// Close Statement and Connection
		st.close();
		conn.close();
		
	}

}
