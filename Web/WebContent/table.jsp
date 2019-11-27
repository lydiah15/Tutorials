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
	String s = request.getParameter("tf1");
	int n = Integer.parseInt(s);
%>
<center><table border="2" bordercolor="red">
<thead><th>OUTPUT</th></thead>
<tbody>
<%
	for(int i=1;i<10;i++)
	{
		out.println("<tr><td>"+n+"*"+i+"="+(n*i)+"</tr></td><br>");
	}
%>	
</tbody>
</table></center>
</body>
</html>
