package webadv.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import webadv.example.service.StudentCourseServiceImp;
@Controller
public class StudentQuerySchedule {
	@Autowired
	private StudentCourseServiceImp studentCourseServiceImp;
		@GetMapping("querySchedule")
		public String manageEngineRoom(Model model) {
			model.addAttribute("studentCourse_list", studentCourseServiceImp.findAllCourse());
			return "studentManager/querySchedule";
		}
}
