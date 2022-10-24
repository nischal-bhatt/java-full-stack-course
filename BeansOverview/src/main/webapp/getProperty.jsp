<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
lol
<jsp:useBean id="user" class="org.studyeasy.beans.User" scope="session"></jsp:useBean>
First Name:<jsp:getProperty property="firstName" name="user"/>
Last Name:<jsp:getProperty property="lastName" name="user"/>
</body>
</html>