<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Games</title>
	<link type="style/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
	<form:form action="results" modelAttribute="game" method="post">
		<input type="text" name="players[0]" class="form-control" />
		<input type="text" name="players[1]" class="form-control" />
		<input type="text" name="players[2]" class="form-control" />
		<input type="text" name="players[3]" class="form-control" />
		<input type="submit" value="Save" class="save" />
	</form:form>
</body>
</html>