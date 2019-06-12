package webadv.s16202218.demo;

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
	
//	@GetMapping("/login")
//	public String login(Model model,String account, String password) {
//		if ("abc".equals(account) && "123".equals(password))
//			return "home";
//		else
//			return "login";
//	}
	
//	@Autowired
//	private TeacherRepository repository;
	
	/*
	 * @Autowired private TeacherServiceImp teacherService;
	 * 
	 * @GetMapping("/login") public String login(Model model) {
	 * model.addAttribute("teacher_list",teacherService.findAll()); //
	 * model.addAttribute("teacher_list",repository.findAll()); return "home"; }
	 */
}
