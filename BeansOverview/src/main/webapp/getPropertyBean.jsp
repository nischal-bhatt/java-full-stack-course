<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<jsp:useBean id="user" class="org.studyeasy.beans.User" scope="session"></jsp:useBean>


<jsp:setProperty property="*" name="user"/>

Values have been sent
<jsp:getProperty property="firstName" name="user"/>
<jsp:getProperty property="lastName" name="user" />
</body>
</html>