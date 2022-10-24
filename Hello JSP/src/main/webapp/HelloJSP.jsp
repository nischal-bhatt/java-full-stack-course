<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello jsp
<%--
   servlet life cycle
   1. 
   html comments dun use in jsp ..
   coz like html comments wil only prevent printing! 
   it wont have impact on method calls 
 --%>
 <h1>
    JSP servlet application
    that app will always run inside a servlet container
     load servlet class
     create instance of servlet
     call the servlets init() method
     when jsp gets executed -> it gets converted to servlet
     call servlets service() method
     servlets destroy method is called 
     
 </h1>
 
 <%! public int x = 22; %>
 <%= x %>
 <br>
 <%= 25 * 4 %>
  <%= 25 < 4 %>
  <br>
  
  <%
     int x = 25;
  out.println(x);
  
  if (x == 25)
  {
	  out.println("x is equal to 25");
  }
  
  for (int i =0; i<10; i++)
  {
	  
	  out.print("<br>");
	  out.print(i);
  }
  %>
  
  
  <%= x %>
  
  
  <%!
     String message() {
	  return "i love jsp";
  }
  %>
  
  
  <%= message() %>
  
  
</body>
</html>