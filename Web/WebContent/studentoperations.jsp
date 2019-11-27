<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink"><center><b><h1>
<% 
	Object o = session.getAttribute("Muya");
	String s = (String) o;
	out.println("<b><div align=right>USER ID:"+s+"</div></b>");
%>
<a href="http://localhost:8080/Web/insert.jsp">Insert</a><br>
<a href="http://localhost:8080/Web/update.jsp">Update</a><br>
<a href="http://localhost:8080/Web/delete.jsp">Delete</a><br>
<a href="http://localhost:8080/Web/select.jsp">Select</a>
</h1></b></center></body>
</html> 