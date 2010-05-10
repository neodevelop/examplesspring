<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>
<body>
	<form:form>
	<h1>Detalles de la reunion</h1>
	<br/>Nombre del evento: ${reunion.nombreDelEvento}
	<br/>Esta activo?: ${reunion.isActive}
	<br/>Esta lleno?: ${reunion.isFull}
	<br/>Fecha: ${reunion.fechaRealizacion}
	<br/><input type="submit" name="_eventId_inicio" value="Revisar datos"/>
	<br/><input type="submit" name="_eventId_creaReunion" value="Crea la reunion"/>
	</form:form>
</body>
</html>