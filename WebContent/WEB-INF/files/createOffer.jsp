
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrape/css/bootstrap.css" />

</head>
<body>
	<sf:errors path="offer.**"></sf:errors>
	<div class="col-md-6 col-md-offset-3">
		<form method="post" class="form-horizontal"
			action="${pageContext.request.contextPath}/created">
			<fieldset>

				<!-- Form Name -->
				<legend>Create Notice</legend>

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="name">Name</label>
					<div class="controls">
						<input id="name" name="name" placeholder="enter name"
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

				<!-- Textarea -->
				<div class="control-group">
					<label class="control-label" for="text">Offer</label>
					<div class="controls">
						<textarea id="text" name="text"></textarea>
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