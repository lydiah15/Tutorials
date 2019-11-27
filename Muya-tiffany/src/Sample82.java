//Modifying employee moses ---you can modify a database table 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample82 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Register DB driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish Database connection(url, user, password)
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		// Create a statement
		Statement st = conn.createStatement();
		// Execute a statement
		st.execute("update employee set empsal=5000 where empno=101");
		// Close Statement and Connection
		st.close();
		conn.close();
	}

}
