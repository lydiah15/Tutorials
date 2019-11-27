

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class Select1Servlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		try {
		String name = request.getParameter("tf2");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=UTC", "root", "lydiah15");
		PreparedStatement pst = conn.prepareStatement("select * from emp where empname=?");
		pst.setString(1, name);
		ResultSet rs = pst.executeQuery(); 
		if(rs.next())
		{
			out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		else
		{
			out.println("The record is not found!");
		}
		
		}
		catch(Exception ee) {
			
		}


	}

}
