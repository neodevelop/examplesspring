<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>
<body>
	<form:form method="post" modelAttribute="reunion">
	<h1>Inicia el flujo!!!</h1>
	<br/>Nombre del evento: <form:input path="nombreDelEvento"/>
	<br/>Esta activo?: <form:checkbox path="isActive"/>
	<br/>Esta lleno?: <form:checkbox path="isFull"/>
	<br/><input type="submit" name="_eventId_evaluaReunion" value="Evalua Reunion" />
	<br/><input type="submit" name="_eventId_creaLista" value="Crear Lista de invitados" />
	</form:form>
</body>
</html>