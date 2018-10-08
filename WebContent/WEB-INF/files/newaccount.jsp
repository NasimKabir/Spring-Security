<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrape/css/bootstrap.css" />

</head>
<body>
	<sf:errors path="offer.**"></sf:errors>
	<div class="col-md-6 col-md-offset-3">
		<form method="post" class="form-horizontal"
			action="${pageContext.request.contextPath}/createaccount">
			<fieldset>

				<!-- Form Name -->
				<legend>Create Account</legend>

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="name">UserName</label>
					<div class="controls">
						<input id="username" name="username" placeholder="enter name"
							class="input-xlarge" type="text" />

					</div>
				</div>

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="email">Email</label>
					<div class="controls">
						<input id="email" name="email" placeholder="enter valid email"
							class="input-xlarge" type="text" />

					</div>
				</div>

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="email">Password</label>
					<div class="controls">
						<input id="password" name="password" class="input-xlarge"
							type="text" />

					</div>
				</div>
				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="email">ConfirmPassword</label>
					<div class="controls">
						<input id="confirmpassword" name="confirmpassword"
							class="input-xlarge" type="text" />

					</div>
				</div>

				<!-- Button -->
				<div class="control-group">
					<label class="control-label" for="submit"></label>
					<div class="controls">
						<button id="submit" name="submit" class="btn btn-primary">Submit</button>
					</div>
				</div>

			</fieldset>
		</form>
	</div>
</body>
</html>