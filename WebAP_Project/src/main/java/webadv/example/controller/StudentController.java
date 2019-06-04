package webadv.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/courseApplication")
	public String courseApplication(Model model) {
		return "courseApplication";
	}
	@GetMapping("/queryResults")
	public String queryResults(Model model) {
		return "queryResults";
	}
	@GetMapping("/querySchedule")
	public String index(Model model) {
		return "querySchedule";
	}
}
