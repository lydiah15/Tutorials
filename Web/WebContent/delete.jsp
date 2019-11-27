<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<center><h1>Delete Record</h1>
<form method="get" "deletestudent.jsp">
Student ID :<input type="text" name="tf1" /><br>
<input type="submit" name="b1" value="DELETE"></center>
</form>
<div align=right><a href="http://localhost:8080/Web/studentoperations.jsp">HOME</div></a><br>
</body>
</html>