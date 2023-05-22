<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show contacts</title>
</head>
<body>
	<h2>PHONE BOOK</h2>
	<table border="1" cellspacing="0">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>address</th>
			<th>phone</th>
			<th>email</th>
			<th>action</th>
		</tr>
		<c:forEach var="contact" items="${contacts}">
			<tr>
				<td>${contact.id}</td>
				<td>${contact.name}</td>
				<td>${contact.address}</td>
				<td>${contact.phone}</td>
				<td>${contact.email}</td>
				<td>
				<a href="Controller?act=delete&id=${contact.id}">Delete</a>
				<a href="Controller?act=editform&id=${contact.id}">Edit</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<h1><a href="./">Lab 7 Home</a></h1>
</body>
</html>
