<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<a href="./"> <= Go Back</a>
	<h2 align="center">Food Menu</h2>
	<table border="1" cellpadding="30%" align="center" bordercolor="red">
		<tr>
			<th>Food Id</th>
			<th>Item</th>
			<th>Price</th>
		</tr>
		<c:forEach var="item" items="${foodItems}">
			<tr>
				<td>${item.id}</td>
				<td>${item.item}</td>
				<td>${item.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>