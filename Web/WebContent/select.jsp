<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<%
try{
	Object o = session.getAttribute("Muya");
	String s = (String) o;
	out.println("<b><div align=right>USER ID:"+s+"</div></b>");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "lydiah15");
	PreparedStatement pst = conn.prepareStatement("select * from stud");
	out.println("<center><b><h1>STUDENT RECORD LIST</h1></b></center>");
	ResultSet rs = pst.executeQuery();
	out.println("<center><table border=2 bordercolor=green>");
	out.println("<thead><th>Student ID</th><th>Name</th><th>City</th></thead>");
	while(rs.next())
	{
		out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
	}
	out.println("</table></center>");
}
catch(Exception e)
{
	out.println(e.getMessage());
}
%>

<div align=right><a href="http://localhost:8080/Web/studentoperations.jsp">HOME</div></a><br>

</body>
</html>