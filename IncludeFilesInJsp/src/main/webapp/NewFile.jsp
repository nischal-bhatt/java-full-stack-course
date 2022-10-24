<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "file1.txt" %>
<br>
<!--  for dynamic -->
<jsp:include page="file2.txt"></jsp:include>
<%@ page import ="java.util.Date" %>
<% out.print(new Date()); %>
<br>

<%@ page import ="org.studyeasy.UserDefined" %>
<% 
   out.print(new UserDefined().Demo());
%>
</body>
</html>