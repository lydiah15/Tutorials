import java.sql.*;
import java.util.*;
// Scanner allows you write data in the console

public class Sample90 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		PreparedStatement pst = conn.prepareStatement("update employee set empsal=? where empno=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Salary");
		pst.setInt(1, sc.nextInt());
		System.out.println("Enter employee Number");
		pst.setInt(2, sc.nextInt());
		pst.execute();
		pst.close();
		conn.close();

	}

}
