

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class EmployeeServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		try {
		String s = request.getParameter("tf1");
		String s1 = request.getParameter("tf2");
		String s2 = request.getParameter("tf3");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=UTC", "root", "lydiah15");
		PreparedStatement pst = conn.prepareStatement("insert into emp values(?,?,?)");
		pst.setInt(1,Integer.parseInt(s));
		pst.setString(2, s1);
		pst.setString(3, s2);
		pst.execute();
		out.println("Successfully inserted employee record!");
		
		}
		catch(Exception ee) {
			
		}


	}

}
