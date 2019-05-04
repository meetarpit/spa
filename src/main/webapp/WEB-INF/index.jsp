<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script src="resources/js/Registration.js"></script>
</head>
<body ng-app="registration" ng-controller="ctrl">
<form ng-submit="register()">
<table>
<tr>
<td>Name:</td>
<td><input type="text" ng-model="registrationForm.name"/></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" ng-model="registrationForm.password"/></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="radio" value="M" ng-model="registrationForm.gender">male
<input type="radio" value="F" ng-model="registrationForm.gender">female
</td>
</tr>
<tr>
<td>Address:</td>
<td><input type="text" ng-model="registrationForm.address"/></td>
</tr>
<tr>
<td><button>submit</button></td>
</tr>
</table>
</form>
<table>
<tr>
<th>Name</th>
<th>Password</th>
<th>Gender</th>
<th>Address</th>
</tr>
<tr ng-repeat="x in userList">
<td>{{x.name}}</td>
<td>{{x.password}}</td>
<td>{{x.gender}}</td>
<td>{{x.address}}</td>
<td><a href="#" ng-click="editEmployee(x)">edit</a></td>
<td><a href="#" ng-click="deleteEmp(x,$index)">delete</a></td>
</tr>
</table>
</body>
</html>
