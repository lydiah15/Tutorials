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
	String str = request.getParameter("tf1");
	StringBuffer sb = new StringBuffer(str);
	out.println(sb.reverse());
%>

</body>
</html>