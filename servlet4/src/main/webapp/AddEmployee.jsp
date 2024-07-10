<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,pack1.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    AdminBean ab=(AdminBean)session.getAttribute("abean");

    String msg=(String)request.getAttribute("msg");
    
	out.println("Welcome Admin: "+ab.getfName()+"<br>"+msg);

%>
  
	<a href="VeiwAllEmployee.html">VeiwAllEmployees</a>	
	 <a href="Logout.html" >AddEmployee</a>
	
</body>
</html>