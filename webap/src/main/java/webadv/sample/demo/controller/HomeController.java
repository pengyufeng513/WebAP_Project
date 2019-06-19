package webadv.sample.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/login")
	public String Index(Model model) {
		return "login";
	}
	@GetMapping("/")
	public String welcome(Model model) {   
	    return "login";		
	}
	@GetMapping("/home")
	public String login(Model model) {
		return "home";
	}
}
