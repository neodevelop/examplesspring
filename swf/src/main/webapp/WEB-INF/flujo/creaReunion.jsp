<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
	<h1>La reunion se ha creado....</h1>
	<h1>Detalles de la reunion</h1>
	<br/>Nombre del evento: ${reunion.nombreDelEvento}
	<br/>Esta activo?: ${reunion.isActive}
	<br/>Esta lleno?: ${reunion.isFull}
	<br/>Fecha: ${reunion.fechaRealizacion}
	<table border="1">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${reunion.invitados}" var="invitado">
			<tr>
				<td>${invitado.nombre}</td>
				<td>${invitado.email}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<br/><a href="welcome.html">Pagina de inicio</a>
</body>
</html>