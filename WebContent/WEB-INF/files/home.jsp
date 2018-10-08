<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	${hello}<br><br><br>
	<a href="${pageContext.request.contextPath}/create"><button>Go To CreateOffer</button></a>
	<a href="${pageContext.request.contextPath}/offer"><button>Offer List</button></a>
</body>
</html>