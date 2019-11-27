

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ColorServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("r1");
		if(s1.equals("red")) 
		{
			out.println("<body bgcolor=red>");
		}
		else if(s1.equals("yellow"))
		{
			out.println("<body bgcolor=yellow>");
		}
		else 
		{
			out.println("<body bgcolor=orange>");
		}
	}

}
