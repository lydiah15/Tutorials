// you can insert as many rows in a table as you want--
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample81 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Register DB driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish Database connection(url, user, password)
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		// Create a statement
		Statement st = conn.createStatement();
		// Execute a statement
		st.execute("insert into employee values(102,'Muya',3452)");
		st.execute("insert into employee values(103,'Surya',4123)");
		st.execute("insert into employee values(104,'Mike',1125)");
		st.execute("insert into employee values(105,'John',5432)");
		// Close Statement and Connection
		st.close();
		conn.close();
	}

}
