import java.sql.*;

public class Sample89 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		PreparedStatement pst = conn.prepareStatement("insert into employee values(?,?,?)");
		pst.setInt(1, 109);
		pst.setString(2, "Mike");
		pst.setInt(3, 4500);
		pst.execute();
		pst.close();
		conn.close();


	}

}
