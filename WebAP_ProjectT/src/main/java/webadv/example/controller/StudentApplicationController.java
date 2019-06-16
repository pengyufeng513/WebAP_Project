package webadv.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.ResponseBody;


import webadv.example.service.StudentApplicationCourseServiceImp;

@Controller
public class StudentApplicationController {
	@Autowired
	private StudentApplicationCourseServiceImp studentCourseApplicationServiceImp;

	@GetMapping("courseApplication")
	public String courseApplication(Model model) {
		model.addAttribute("studentApplicationCourse_list",studentCourseApplicationServiceImp.findAllApplicationCourse());
		return "studentManager/courseApplication";
	}
	
	@GetMapping("courseApplicationAdd/{values}")
	
	public @ResponseBody int AddStudentCourse(@PathVariable (value="values") String values,Model model) {
		String[] split = values.split(",");
		int total=0;
		for (String string : split) {
			if(studentCourseApplicationServiceImp.CheckCourse(string)==0)
			{
				 studentCourseApplicationServiceImp.AddCourse(string);
				    total++;
			}
		}
		 return total;
	}
}
