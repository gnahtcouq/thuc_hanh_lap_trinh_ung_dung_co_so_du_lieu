<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit a contact</title>
</head>
<body>
	<h2>Edit a contact</h2>
	<form method="post" action="Controller?act=edit&id=${contact.id}">
		<table border="0" cellspacing="0">
			<tr>
				<td>Name:</td>
				<td><input name="name" value="${contact.name}"></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input name="address" value="${contact.address}"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input name="phone" value="${contact.phone}"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input name="email" value="${contact.email}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value=" Edit ">
					<h3>
						<a href="./Controller">Lab 7 Home</a>
					</h3></td>
			</tr>
		</table>
	</form>
</body>
</html>