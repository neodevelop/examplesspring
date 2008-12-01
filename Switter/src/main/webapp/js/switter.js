function init() {
	getTimeLine();
}

function getTimeLine() {
	TwitterService.obtenerLineaDeTiempoPublica( function(statuses) {
		dwr.util.removeAllRows("messagebody", {
			filter : function(tr) {
				return (tr.id != "pattern");
			}
		});
		var status;
		for ( var i = 0; i < statuses.length; i++) {
			status = statuses[i];
			var id = i+1;
			dwr.util.cloneNode("pattern", {
				idSuffix :id
			});
			dwr.util.setValue("tableUser" + id, status.user.name);
			dwr.util.setValue("tableMessage" + id, status.text);
			$("pattern" + id).style.display = "table-row";
		}
	});
}

function getMyTimeLine() {
	var user = document.auth.user.value;
	var pass = document.auth.pass.value;
	//alert(user+" "+pass);
	
	TwitterService.obtenerLineaDeTiempo(user,pass, function(statuses) {
		dwr.util.removeAllRows("messagebody", {
			filter : function(tr) {
				return (tr.id != "pattern");
			}
		});
		var status;
		for ( var i = 0; i < statuses.length; i++) {
			status = statuses[i];
			var id = i+1;
			dwr.util.cloneNode("pattern", {
				idSuffix :id
			});
			dwr.util.setValue("tableUser" + id, status.user.name);
			dwr.util.setValue("tableMessage" + id, status.text);
			$("pattern" + id).style.display = "table-row";
		}
	});
	
}

function sendMessage(){
	var user = document.auth.user.value;
	var pass = document.auth.pass.value;
	var message = document.auth.message.value;
	document.auth.message.value =  "";
	TwitterService.actualizaEstado(user,pass,message, function() {});
	alert("Mensaje enviado...");
}