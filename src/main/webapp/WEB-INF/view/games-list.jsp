<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>List of games</title>
	<link type="style/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<h1>List of games:</h1>
<table>
	<tr>
		<th>id</th>
		<th>start date</th>
	</tr>
	<c:forEach var="game" items="${games}">
		<tr>
			<td>${games.id}</td>
			<td>${games.startDate}</td>
		</tr>	
	</c:forEach>
</table>


</body>
</html>