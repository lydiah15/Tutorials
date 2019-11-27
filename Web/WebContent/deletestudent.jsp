<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
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
	
	Object o = session.getAttribute("Muya");
	String s = (String) o;
	out.println("<b><div align=right>USER ID:"+s+"</div></b>");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "lydiah15");
	PreparedStatement pst = conn.prepareStatement("delete from stud where sid=?");
	pst.setInt(1, n);
	pst.execute();
	out.println("YOU HAVE SUCCESSFULY DELETED A RECORD!");
}
catch(Exception e) {
	out.println(e.getMessage());
}
%>
<div align=right><a href="http://localhost:8080/Web/studentoperations.jsp">HOME</div></a><br>
</body>
</html>