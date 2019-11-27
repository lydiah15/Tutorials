
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("tf1");
		String s2 = request.getParameter("tf2");
		HttpSession hs = request.getSession();
		if(s1.equals(s2)) 
		{
			hs.setAttribute("LOGIN", s1); //attribute name and value
			response.sendRedirect("Display.html");
		}
		else
		{
			out.print("LOGIN FAILED");
		}

	}

}
//20 			response.sendRedirect("http://localhost:8080/Web/Add.html");
