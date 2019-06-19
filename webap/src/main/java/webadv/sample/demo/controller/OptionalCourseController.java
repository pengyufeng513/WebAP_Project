package webadv.sample.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import webadv.sample.demo.entity.BeginCourse;
import webadv.sample.demo.entity.TeachCourse;
import webadv.sample.demo.service.CourseServiceImp;

@Controller
public class OptionalCourseController {
	@Autowired
	private CourseServiceImp courseService;
	
	@GetMapping("AuditCourseSelection")
	public String auditCourseSelection(Model model) {
		model.addAttribute("begincourse_list", courseService.findBeginCourseAll());
		return "educAdmin/AuditCourseSelection";
	}
	@GetMapping("/UpdateBeginCourse/{value}")
	public String UpdateBeginCourse(@PathVariable(value = "value")String value, Model model) {
		int index = Integer.parseInt(value) - 1;
		List<BeginCourse> list = courseService.findBeginCourseAll();
		BeginCourse beginCourse = new BeginCourse(list.get(index).getTeacherId(),
				list.get(index).getCourseId(), list.get(index).getCourseTerm());
		courseService.UpdateBeginCourse(beginCourse.getTeacherId(), beginCourse.getCourseId(), beginCourse.getCourseTerm()); 
		TeachCourse teachCourse = new TeachCourse(list.get(index).getTeacherId(),
				list.get(index).getCourseId(), list.get(index).getCourseTerm());
		courseService.AddTeachCourse(teachCourse.getTeacherId(),teachCourse.getCourseId(), teachCourse.getCourseTerm());
		return "home";
	}
}
