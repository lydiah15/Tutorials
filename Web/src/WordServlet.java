

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WordServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("c1");
		String s2 = request.getParameter("c2");
		String s3 = request.getParameter("c3");

		out.println("TOTAL NAME was "+(s1+s2+s3));

	}

}