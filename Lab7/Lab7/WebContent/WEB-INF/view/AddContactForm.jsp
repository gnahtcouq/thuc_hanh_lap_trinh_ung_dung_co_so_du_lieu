<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a contact</title>
</head>
<body>
	<h2>Add a contact</h2>
	<form method="post" action="Controller?act=add">
		<table border="0" cellspacing="0">
			<tr>
				<td>Name:</td>
				<td><input name="name"></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input name="address"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input name="phone"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input name="email"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value=" Add ">
					<h3>
						<a href="./">Lab 7 Home</a>
					</h3></td>
			</tr>
		</table>
	</form>
</body>
</html>