<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
<jsp:useBean id="user" class="org.studyeasy.beans.User" scope="request"></jsp:useBean>

<jsp:getProperty property="firstName" name="user"/>
<jsp:getProperty property="lastName" name="user" />
<br>
<jsp:setProperty property="firstName" name="user" value="amaraNicole"/>
<jsp:setProperty property="lastName" name="user" value="yacob"/>
Values have been sent

<%
  request.getRequestDispatcher("getRequestProperty.jsp").forward(request,response);
%>

</body>
</html>