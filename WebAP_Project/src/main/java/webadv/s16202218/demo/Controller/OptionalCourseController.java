package webadv.s16202218.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webadv.s16202218.demo.service.CourseServiceImp;

public class OptionalCourseController {
	@Autowired
    private CourseServiceImp courseService;
	
	@GetMapping("/AuditCourseSelection")
	public String login(Model model) {
		model.addAttribute("begincourse_list",courseService.findAll());
		return "AuditCourseSelection";
	}
}
