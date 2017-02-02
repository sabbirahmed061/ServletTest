<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
String userName=request.getParameter("name");
if (userName!=null){
	//session.setAttribute("savedUserName", userName);
	//application.setAttribute("applicationUserName", userName);
	pageContext.setAttribute("pageContextUserName", userName);
	
	
	pageContext.setAttribute("savedUserName", userName, PageContext.SESSION_SCOPE);
	pageContext.setAttribute("applicationUserName", userName, PageContext.APPLICATION_SCOPE);
}
%>
<br>
The user name is: <%=userName %>
<br>
The session Obj: <%=session.getAttribute("savedUserName") %>
<br>
The session Obj from page context: <%=pageContext.getAttribute("savedUserName",PageContext.SESSION_SCOPE) %>
<br>
The application context object is: <%=application.getAttribute("applicationUserName") %>
<br>
The application context object from page context is: <%=pageContext.getAttribute("applicationUserName",PageContext.APPLICATION_SCOPE) %>
<br>

The page context: <%=pageContext.getAttribute("pageContextUserName")%>
</body>
</html>