package org.srini.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	protected String helloWorld(ModelMap model){
		model.addAttribute("msg", "hello srinivas");
		return "HelloWorldPage";
	}
}
