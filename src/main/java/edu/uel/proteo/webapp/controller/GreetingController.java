package edu.uel.proteo.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);
	
	@GetMapping("greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		logger.info("greattings for : " + name);
		model.addAttribute("name", name);
		return "greeting";
	}
}
