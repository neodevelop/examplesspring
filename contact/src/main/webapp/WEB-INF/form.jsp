<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Contact Us</title>
		<style>
			.form-item { margin: 20px 0; }
			.form-label { font-weight: bold; }
			.form-error-field { background-color: #FFC; }
			.form-error-message { font-weight: bold; color: #900; }
		</style>
	</head>
	<body>
	
<h1>Contact Us</h1>

<%-- Give command object a meaningful name instead of using default name, 'command' --%>
<form:form commandName="userMessage">
	<div class="form-item">
		<div class="form-label">Your name:</div>
		<form:input path="name" size="40" cssErrorClass="form-error-field"/>
		<div class="form-error-message"><form:errors path="name"/></div>
	</div>
	<div class="form-item">
		<div class="form-label">Your e-mail address:</div>
		<form:input path="email" size="40" cssErrorClass="form-error-field"/>
		<div class="form-error-message"><form:errors path="email"/></div>
	</div>
	<div class="form-item">
		<div class="form-label">Your message:</div>
		<form:textarea path="text" rows="12" cols="60" cssErrorClass="form-error-field"/>
		<div class="form-error-message"><form:errors path="text"/></div>
	</div>
	<div class="form-item">
		<input type="submit" value="Submit" />
	</div>
</form:form>

	</body>
</html>
