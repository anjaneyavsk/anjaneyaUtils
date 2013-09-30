package org.srini.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	protected String showForm(ModelMap model){
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	
	protected String processForm(LoginForm loginForm, BindingResult result,ModelMap model) {
		 loginForm = (LoginForm) model.get("loginForm");

		if(StringUtils.hasText(loginForm.getUserName()) && StringUtils.hasText(loginForm.getPassword())){
			model.addAttribute("msg", loginForm.getUserName());
			
		}else{
			model.addAttribute("msg", "Sorry, not able to process your login");
		}
		return "HelloWorldPage"; 
	}
}
