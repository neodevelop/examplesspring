<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>

</head>
<body>
	<h1>Pagina segura</h1>
	<sec:authorize ifAllGranted="ROLE_USER">
		<h2>If All Granted</h2>
	</sec:authorize>
	<sec:authorize ifNotGranted="ROLE_ADMIN">
		<h2>If Not Granted</h2>
	</sec:authorize>
	<sec:authorize ifAnyGranted="ROLE_ADMIN">
		<h2>If Any Admin Granted</h2>
	</sec:authorize>
</body>
</html>