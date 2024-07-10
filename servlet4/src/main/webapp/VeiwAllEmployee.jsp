<%@page import="javax.swing.text.html.HTMLDocument.Iterator"%>
<%@page import="java.util.*,pack1.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="pack1.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert titl+-e here</title>
<style>
     
</style>
</head>
<body background-color="black" >
<%
  AdminBean abb=(AdminBean)session.getAttribute("abean");
 ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)session.getAttribute("alist");
 
if(al.size()==0)
{
	out.println(" NO employess Available in Your Company TCS <br>");
	
}
else
{
	java.util.Iterator<EmployeeBean> it=al.iterator();
	out.println(" Welcome Admin :"+abb.getfName()+"<br>");
	while(it.hasNext())
	{
		EmployeeBean ab=(EmployeeBean)it.next();
		
		out.println(ab.geteId()+"&nbsp&nbsp" +ab.geteName()+"&nbsp&nbsp" +ab.geteDesg()+"&nbsp&nbsp" +ab.geteBsal()+ "&nbsp&nbsp"+ab.geteHra()+"&nbsp&nbsp" +ab.geteDa()+ "&nbsp&nbsp"+ab.geteTsal()+"<a href='edit?eId="+ab.geteId()+"'>Edit </a>" + " &nbsp&nbsp"+"<a href='delete?eId="+ab.geteId()+"'>Delete </a>"+ "<br>");
	}
}
%>
  <a href="AddEmployee.html" >AddEmployee</a>
  <a href="Logout.html" >Logout</a>




</body>
</html>