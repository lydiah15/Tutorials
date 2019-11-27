

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("r1");
		String s2 = request.getParameter("c1");
		String s3 = request.getParameter("c2");
		String s4 = request.getParameter("c3");
		String s5 = request.getParameter("c4");
		String s6 = request.getParameter("tf1");
		
		if(s1.equals("ID")) 
		{
			out.println("578352");
		}
		else if(s1.equals("Name"))
		{
			out.println("Tony Stark");
		}
		else 
		{
			out.println("Bachelor of Science in Engineering");
		}
		
		if(s6.equals("---")|| s6.equals("All")|| s6.equals("Male")|| s6.equals("Female") )
		{
			out.println(s6);
		}
		
		out.println("FROM: "+" "+s2+" "+s3+" "+s4+" "+s5);
	}

}