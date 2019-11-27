

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class LaborerServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		try {
		String s = request.getParameter("tf1");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1?serverTimezone=UTC", "root", "lydiah15");
		PreparedStatement pst = conn.prepareStatement("delete from emp where empID=?");
		pst.setInt(1,Integer.parseInt(s));
		pst.execute();
		out.println("YOU HAVE SUCCESSFULLY DELETED THE EMPLOYEE ID!!!");
		
		}
		catch(Exception ee) {
			
		}


	}

}
