
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
<form name="auth" id="auth">
	User:<input type="text" name="user" id="user" />
	<br>Pass:<input type="password" name="pass" id="pass" />
	<br>Message:<input type="text" name="message" id="message" />
	<br><a href="javascript:getMyTimeLine()">Refresh</a>
	<br><a href="javascript:sendMessage()">Send</a>
</form>
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