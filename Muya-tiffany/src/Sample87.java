// INSERT, UPDATE, AND DELETE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample87 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Register DB driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish Database connection(url, user, password)
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		// Create a statement
		Statement st = conn.createStatement();
		// Execute a statement
		st.execute("insert into employee values(106,'Andy',6200)");
		st.execute("insert into employee values(107,'Jeremy',4327)");
		st.execute("insert into employee values(108,'Hal',6700)");
		st.execute("update employee set empsal=5500 where empno=101");
		st.execute("delete from employee where empno=104");
		// Close Statement and Connection
		st.close();
		conn.close();
	}

}
