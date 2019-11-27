// SELECT
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample88 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Register DB driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establish Database connection(url, user, password)
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		// Create a statement
		Statement st = conn.createStatement();
		// Execute a statement
	    ResultSet rs = st.executeQuery("select * from employee");
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getInt(3));
	    }
		// Close Statement and Connection
		st.close();
		conn.close();
	}

}
