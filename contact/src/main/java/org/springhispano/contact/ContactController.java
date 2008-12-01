package org.springhispano.contact;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public final class ContactController {
	
	@Autowired
	private Validator validator;
	
	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	
	@RequestMapping(value = "/form.html", method = RequestMethod.GET)
	public ModelMap get() {
		
		// Because we're not specifying a logical view name, the
		// DispatcherServlet's DefaultRequestToViewNameTranslator kicks in.
		return new ModelMap("userMessage", new UserMessage());
	}
	
	@RequestMapping(value = "/form.html", method = RequestMethod.POST)
	public String post(@ModelAttribute("userMessage") UserMessage userMsg,
			BindingResult result) {
		
		validator.validate(userMsg, result);
		if (result.hasErrors()) { return "form"; }
		System.out.println(ToStringBuilder.reflectionToString(userMsg));
		// Use the redirect-after-post pattern to reduce double-submits.
		return "redirect:thanks.html";
	}
	
	@RequestMapping("/thanks.html")
	public void thanks() {
	}
}
