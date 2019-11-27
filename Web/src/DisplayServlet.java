

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DisplayServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String s = request.getParameter("tf1");
		HttpSession hs = request.getSession();
		Object o = hs.getAttribute("LOGIN");
		String str = (String) o;
		out.println("<div align=right>LOGIN USER:"+str+"</div><br>");
		out.println("<div align=right><a href=http://localhost:8080/Web/LogoutServlet>SIGNOUT</a></div><br>");
		out.println(s.toUpperCase());
	} 


}
