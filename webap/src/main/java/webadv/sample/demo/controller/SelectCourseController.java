package webadv.sample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webadv.sample.demo.service.CourseServiceImp;

@Controller
public class SelectCourseController {
	@Autowired
	private CourseServiceImp courseService;
	
	@GetMapping("CourseSelectionInformation")
	public String courseSelectionInformation(Model model) {
		model.addAttribute("choosecourse_list", courseService.findChooseCourseAll());
		return "educAdmin/CourseSelectionInformation";
	}
}
