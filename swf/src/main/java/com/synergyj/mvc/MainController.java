package com.synergyj.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import com.synergyj.services.InvitadoService;

@Controller
public class MainController {

	@Autowired
	InvitadoService invitadoService;
	
	@RequestMapping("/welcome.html")
	public String welcome(){
		invitadoService.limpia();
		return "welcome";
	}
	
	@RequestMapping("/seguro/seguro.html")
	public String seguro(@CookieValue("JSESSIONID")String session){
		System.out.println(session);
		return "seguro";
	}
	
	@RequestMapping("/super/seguro/seguro.html")
	public String superSeguro(){
		return "superSeguro";
	}
}
