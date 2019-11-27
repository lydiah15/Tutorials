<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Object o = session.getAttribute("MOSES");
String s = (String) o;
out.println("<center><h1>USER ID:"+s.toUpperCase()+"</h1></center>");

%>

</body>
</html>