import java.sql.*;
import java.util.*;

public class Sample92 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muyatiffany?serverTimezone=UTC", "root", "lydiah15");
		PreparedStatement pst = conn.prepareStatement("select * from employee where empno=?");
		System.out.println("Enter Employee Number");
		Scanner sc = new Scanner(System.in);//accept any value from keyboard
		pst.setInt(1, sc.nextInt());
		//pst.setInt(1, 102);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		pst.execute();
		pst.close();
		conn.close();
	}

}
