<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="cyan"   align="center" background="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZr92IiL8GIBlWUX_5L9w4hed2quGdJBJUqA&usqp=CAU" 
   style="background-size: 1300px 1300px 1300px;">
 
  <marquee behavior="scroll" direction="left"><h1 text="green">Welcome To TATA CONSULTANCY SERVICE</h1></marquee>
 

      <%
      String msg=(String)request.getAttribute("msg");
      out.println(msg);
      %>
</body>
</html>