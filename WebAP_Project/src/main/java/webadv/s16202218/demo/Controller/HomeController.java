package webadv.s16202218.demo.Controller;

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
	@GetMapping("/AuditCourseSelection")
	public String auditCourseSelection(Model model) {
		return "AuditCourseSelection";
	}
	@GetMapping("/CourseSelectionInformation")
	public String courseSelectionInformation(Model model) {
		return "CourseSelectionInformation";
	}
	@GetMapping("/CourseInformation")
	public String courseInformation(Model model) {
		return "CourseInformation";
	}
	@GetMapping("/SchedulingClassTime")
	public String schedulingClassTime(Model model) {
		return "SchedulingClassTime";
	}
	@GetMapping("/ArrangeThePlaceOfClass")
	public String arrangeThePlaceOfClass(Model model) {
		return "ArrangeThePlaceOfClass";
	}
}
