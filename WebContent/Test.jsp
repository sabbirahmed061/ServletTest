<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test JSP Page</title>
</head>
<body>
	<h3>T3esting</h3>
	<%!public int add(int a, int b) {
		return a + b;
	}%>

	<%
		int i = 1;
		int j = 2;
		int k = i + j;

		out.println("k : " + k);
	%>
	Value of k:
	<%=k%>!!
	<%
		k = add(234234, 234234);
	%>
	<br> Value of k:
	<%=k%>!!
	
	<%for (i=0;i<5;i++){
	%>
	<br>the value of i=<%=i%>
	<%} %>
</body>
</html>