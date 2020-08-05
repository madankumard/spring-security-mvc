package mk.springdemo.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	Logger logger = Logger.getLogger(getClass().getName());
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/leaders")
	public String showLeaders() {
		logger.info("In leaders");
		return "leaders";
	}
	
	@GetMapping("/systems")
	public String showSystems() {
		logger.info("In systems");
		return "systems";
	}
}
