import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample86 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// Register DB driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish Database connection(url, user, password)
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		// Create a statement
		Statement st = conn.createStatement();
		// Execute a statement
		//st.execute("delete from employee where empno=103");--delete a row in a table
		//empsal>=5000;
		//where empsal between 3000 and 4500
	    ResultSet rs = st.executeQuery("select * from employee where empno=101 or empno=105");
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1));
	    	System.out.println(rs.getString(2));
	    	System.out.println(rs.getInt(3));

	    }
		// Close Statement and Connection
		st.close();
		conn.close();
	}

}
