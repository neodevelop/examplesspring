
<html>
<head>
<title>Switter in Spring MVC</title>
<script type='text/javascript'
	src='/Switter/dwr/interface/TwitterService.js'></script>
<script type='text/javascript' src='/Switter/dwr/engine.js'></script>
<script type='text/javascript' src='/Switter/dwr/util.js'></script>
<script type='text/javascript' src='/Switter/js/switter.js'></script>
</head>
<body onload="init()">
<a href="javascript:fillTable()">Refresh...</a>
<br>
<h3>All Messages</h3>
<table border="1" class="rowed grey">
	<thead>
		<tr>
			<th>User</th>
			<th>Message</th>
		</tr>
	</thead>
	<tbody id="messagebody">
		<tr id="pattern" style="display: none;">
			<td><span id="tableUser">user</span><br />
			</td>
			<td><span id="tableMessage">message</span></td>
		</tr>
	</tbody>
</table>

</body>
</html>