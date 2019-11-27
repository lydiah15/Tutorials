<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<% 
try{
	String s1 = request.getParameter("tf1");
	int n = Integer.parseInt(s1);
	String s2 = request.getParameter("tf2");
	
	Object o = session.getAttribute("Muya");
	String s = (String) o;
	out.println("<b><div align=right>USER ID:"+s+"</div></b>");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "lydiah15");
	PreparedStatement pst = conn.prepareStatement("update student set scity=? where sid=?");
	pst.setString(1, s2);
	pst.setInt(2, Integer.parseInt(s1));
	pst.execute();
	out.println("<center><b>YOU HAVE UPDATED A RECORD!</b></center>");
}
catch(Exception e) {
	out.println(e.getMessage());
}
%>

<div align=right><a href="http://localhost:8080/Web/studentoperations.jsp">HOME</div></a><br>

</body>
</html>