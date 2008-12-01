package org.springhispano.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyControllerWithImplement implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// Aqui va la logica del controller y el uso de servicios de negocio
		return new ModelAndView("saludaWithImplement");
	}

}
