<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<marquee>hello jsp</marquee>

<%! public int x = 22; %>
<%= x %>
<br>
<%= 25*4  %> <br>
<%= 25>4  %>
<br>

<%

   int x = 25;
  out.println(x);
  %>
  <br>
  <% 
  if (x > 25)
  {
	  out.println("x is greater than 25");
  }else{
	  out.println("x is not greater than 25");
  }
%>

<br>


<%

   for (int j = 0; j<10; j++)
   {
	   out.print("<br/>");
	   out.print(j);
   }
%>


<%!
   String message() {
	
	return "I love JSP";
}
%>
<%-- this is a jsp comment --%>
<% out.println("<br/>"); %>
<%= message() %>
</body>
</html>