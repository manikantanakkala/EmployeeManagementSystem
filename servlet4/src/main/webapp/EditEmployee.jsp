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
		EmployeeBean ab=(EmployeeBean)request.getAttribute("ebean");
		
	%>
	<form action="update" method="post">
	<input type="hidden" name="eId" value=<%= ab.geteId() %>>
	BasicSalary: <input type="text" name="eBsal" value=<%= ab.geteBsal() %>>
	HRA: <input type="text" name="eHra" value=<%= ab.geteHra() %>>
	DA:  <input type="text" name="eDa" value=<%= ab.geteDa() %>>
	<input type="submit" value="Update">
	
	</form>
</body>
</html>