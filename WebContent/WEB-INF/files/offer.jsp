<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrape/css/bootstrap.css" />
</head>
<body>
	<h2>Results</h2>
	<table class="table table-striped">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Offer</th>
		</tr>
		<c:forEach var="row" items="${hello}">
			<tr>
				<td><c:out value="${row.id}"></c:out></td>
				<td><c:out value="${row.name}"></c:out></td>
				<td><c:out value="${row.email}"></c:out></td>
				<td><c:out value="${row.text}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>