<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Name</th>
<th>Password</th>
<th>Gender</th>
<th>Address</th>
</tr>
<c:forEach items="${emp}" var="emp">
<tr>
<td>${emp.name}</td>
<td>${emp.password}</td>
<td>${emp.gender}</td>
<td>${emp.address}</td>
</tr></c:forEach>
</table>
</body>
</html>