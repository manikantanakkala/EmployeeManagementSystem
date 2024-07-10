<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="pack1.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	a{
		text-decoration: none;
		text-size-adjust: 20px;
		background-color: black;
		color: white;
		}
			
	body{
	
		background-repeat: no-repeat;
		background-size: cover;
	}
</style>
</head>
<body bgcolor="cyan"   align="center" background="https://www.google.com/url?sa=i&url=https%3A%2F%2Fmarketplace.6clicks.com%2Ftata-consultancy-services.html&psig=AOvVaw0VG4jESjKkNW-NvvtEmX9R&ust=1710736908920000&source=images&cd=vfe&opi=89978449&ved=0CBMQjRxqFwoTCPiz-t-9-oQDFQAAAAAdAAAAABAN" 
   style="background-size: 1300px 1300px 1300px;">
 
  <marquee behavior="scroll" direction="left"><h1 text="green">Welcome To TATA CONSULTANCY SERVICE</h1></marquee>
<%
	AdminBean a=(AdminBean)session.getAttribute("abean");
	String msg=(String)request.getAttribute("msg");
	
	out.println("Welcome Admin: "+a.getfName()+"<br><br><br><br><br>");
	
	
%>

<a href="AddEmployee.html">AddEmployee</a> <br> <br> 
<a href="VeiwAllEmployee.html">ViewAllEmployees</a> <br> <br> 
<a href="Logout.html">logout</a>
</body>
</html>