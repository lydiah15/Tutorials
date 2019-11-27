

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class WorkerServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		try {
		String s1 = request.getParameter("tf1");
		String s2 = request.getParameter("tf2");
		String s3 = request.getParameter("tf3");
		String s4 = request.getParameter("r1"); 
		String s5 = request.getParameter("c1");
		String s6 = request.getParameter("c2");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/worker?serverTimezone=UTC", "root", "lydiah15");
		PreparedStatement pst = conn.prepareStatement("insert into emp values(?,?,?,?,?,?)");
		pst.setInt(1,Integer.parseInt(s1));
		pst.setString(2, s2);
		pst.setString(3, s3);
		pst.setString(4, s4);
		pst.setString(5, s5);
		pst.setString(6, s6);
		pst.execute();
		out.println("YOU HAVE SUCCESSFULY INSERTED A RECORD IN WORKER DATABASE!");
		
		}
		catch(Exception ee) {
			
		}


	}

}
