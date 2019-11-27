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
	String usr = request.getParameter("tf1");
	String pwd = request.getParameter("tf2");
	if(usr.equals(pwd))
	{
		session.setAttribute("MOSES", usr);
		response.sendRedirect("session.jsp");
	}
	else
	{
		out.println("INVALID");	
	}

%>
</body>
</html>