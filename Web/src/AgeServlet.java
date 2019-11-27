

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("tf1");
		if(s1.equals("23"))
		{
			out.println("<b><h1>You are a child</h1></b>");
		}
		else if(s1.equals("45"))
		{
			out.println("<b><h1>You are elder</h1></b>");

		}
		else if(s1.equals("67"))
		{
			out.println("<b><h1>You are old</h1></b>");

		}

	}

}