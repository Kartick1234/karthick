<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddCustomer page</title>
<style type="text/css">
	.error{
		color: red;
		font-family: serif;
		font-style: italic;
	}
</style>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">
	<form:hidden path="id"/>
	Enter name: <form:input path="name"/><form:errors path="name" class="error"/><br/>
	Enter title: <form:input path="title"/><form:errors path="title" class="error"/><br/>
	Enter marital_status: <form:input path="marital_status"/><form:errors path="marital_status" class="error"/><br/>
	Enter phone: <form:input path="phone"/><form:errors path="phone" class="error"/><br/>
	Enter email: <form:input path="Email"/><form:errors path="Email" class="error"/><br/>
	
	<input type="submit"/>
</form:form>
</body>
</html>




