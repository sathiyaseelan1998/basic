<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>create</title>
</head>
<body>
<form:form action="create" modelAttribute="bo" method="post">
	<label>Name</label>
	<form:input path="name" placeholder="Enter the name"/>
	<form:errors path="name"></form:errors>
	<label>Email</label>
	<form:input path="email" placeholder="Enter the email"/>
	<label>Mobile</label>
	<form:input path="mobile" placeholder="Enter the mobile"/>
	
	<button>Create</button>
</form:form>
<div>
	${msg}
</div>
</body>
</html>
