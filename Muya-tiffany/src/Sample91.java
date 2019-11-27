import java.sql.*;

public class Sample91 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		PreparedStatement pst = conn.prepareStatement("delete from employee where empno=?");
		pst.setInt(1, 109);
		pst.execute();
		pst.close();
		conn.close();
	}

}
