<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
its the default page which will show up when server is run

<a href="<%= request.getContextPath()  %>/Controller?page=login">Login</a>
<a href="<%= request.getContextPath()  %>/Controller?page=signup">Signup</a>
<a href="<%= request.getContextPath()  %>/Controller?page=about">About</a>
</body>
</html>