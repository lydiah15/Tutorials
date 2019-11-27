//JDBC --- creating a database table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample80 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/surya?serverTimezone=UTC", "root", "lydiah15");
		Statement st = conn.createStatement();
		st.execute("create table student(studno int,studname varchar(15),studcity varchar(15))");
		st.close();
		conn.close();
	}

}
