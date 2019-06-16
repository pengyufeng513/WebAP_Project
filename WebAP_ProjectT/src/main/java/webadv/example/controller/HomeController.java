package webadv.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


	@GetMapping("/")
	public String index(Model model) {
		return "login";
	}
	@GetMapping("/home")
	public String loginIn(Model model) {
		return "home";
	}
	

}
