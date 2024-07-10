<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,pack1.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	     String msg=(String)request.getAttribute("msg1");
	     out.println(msg);
	
	%>
	<a href="AddEmployee.html">AddEmployee</a>
	<a href="VeiwAllEmployee.html">VeiwAllEmployees</a>	
	
	

</body>
</html>