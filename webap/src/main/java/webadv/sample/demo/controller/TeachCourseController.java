package webadv.sample.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import webadv.sample.demo.entity.TeachCourse;
import webadv.sample.demo.service.CourseServiceImp;

@Controller
public class TeachCourseController {
	
	@Autowired
	private CourseServiceImp courseService;
	
	@GetMapping("CourseInformation")
	public String courseInformation(Model model) {
		model.addAttribute("teachcourse_list", courseService.findTeachCourseAll());
		return "educAdmin/CourseInformation";
	}
	@GetMapping("SchedulingClassTime")
	public String schedulingClassTime(Model model) {
		model.addAttribute("teachcourse_list", courseService.findTeachCourseTimeAll());
		return "educAdmin/SchedulingClassTime";
	}
	@GetMapping("ArrangeThePlaceOfClass")
	public String arrangeThePlaceOfClass(Model model) {
		model.addAttribute("teachcourse_list", courseService.findTeachCourseAddressAll());
		return "educAdmin/ArrangeThePlaceOfClass";
	}
	
	@GetMapping("/UpdateTime/{value}")
	public String UpdateTime(@PathVariable(value="value")String value,Model model) {
		String values[] = value.split(" ");
		int index = Integer.parseInt(values[0]) - 1;
		List<TeachCourse> list = courseService.findTeachCourseTimeAll();
		courseService.UpdateTeachCourseTime(list.get(index).getTeacherId(), list.get(index).getCourseId(), 
				list.get(index).getCourseTerm(), values[1]);
		return "home";
	}
	@GetMapping("/UpdatePlace/{value}")
	public String UpdateAddress(@PathVariable(value="value")String value,Model model) {
		String values[] = value.split(" ");
		int index = Integer.parseInt(values[0]) - 1;
		List<TeachCourse> list = courseService.findTeachCourseAddressAll();
		courseService.UpdateTeachCourseAddress(list.get(index).getTeacherId(), list.get(index).getCourseId(), 
				list.get(index).getCourseTerm(), values[1]);
		return "home";
	}
}
