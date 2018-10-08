<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Page</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrape/css/bootstrap.css" />

</head>
<body onload='document.f.username.focus();'>
	<h3>Login with Username and Password</h3>
	<div class="col-md-6 col-md-offset-3">
		<body onload='document.f.username.focus();'>
			<form class="form-horizontal" name="f" action="/security01/login"
				method="POST">
				<fieldset>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="username">Username</label>
						<div class="col-md-5">
							<input id="username" name="username" placeholder="username"
								class="form-control input-md" required="" type="text">

						</div>
					</div>

					<!-- Password input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="password">Password</label>
						<div class="col-md-5">
							<input id="password" name="password" placeholder="password"
								class="form-control input-md" required="" type="password">

						</div>
					</div>
					<div class="alert-danger">
						<c:if test="${param.error !=null}">
							<span>Something is wrong</span>
						</c:if>
					</div>
					<!-- Button -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="singlebutton"></label>
						<div class="col-md-4">
							<button id="singlebutton" name="singlebutton"
								class="btn btn-primary">Submit</button>
						</div>
					</div>

				</fieldset>
			</form>
	</div>
	<a href="${pageContext.request.contextPath}/newaccount"><button>create
			user</button></a>
</body>
</html>