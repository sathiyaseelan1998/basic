<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	
	<c:forEach items="${list}" var="l">
	<tr>
		<td>${l.id}</td>
		<td>${l.name}</td>
		<td>${l.email}</td>
		<td>${l.mobile}</td>	
		<td><a href="update?id=${l.id}">Update</a></td>
		<td><a href="delete?id=${l.id}">Delete</a></td>
	</tr>
	
	</c:forEach>

</table>
</body>
</html>
