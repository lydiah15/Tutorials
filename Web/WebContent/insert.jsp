<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<% 
	Object o = session.getAttribute("Muya");
	String s = (String) o;
	out.println("<b><div align=right>USER ID:"+s+"</div></b>");
%>
<form method="get" "insertstudent.jsp">
<center><h1>Insert Record</h1>
<pre><b>Student ID :<input type="text" name="tf1" /><br>
<b>Student Name :<input type="text" name="tf2"/><br>
<b>Student City :<input type="text" name="tf3"/><br></pre>
<input type="submit" name="b1" value="INSERT"/></center>
</form>
<div align=right><a href="http://localhost:8080/Web/studentoperations.jsp">HOME</div></a><br>
</body>
</html>