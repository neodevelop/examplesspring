<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>
<body>
	<form:form modelAttribute="invitado">
		<br/>Nombre: <form:input path="nombre"/>
		<br/>Email:<form:input path="email"/>
		<br/><input type="submit" name="_eventId_agrega" value="Agrega Invitado"/>
		<br/><input type="submit" name="_eventId_inicio" value="Revisar datos"/>
	</form:form>
</body>
</html>