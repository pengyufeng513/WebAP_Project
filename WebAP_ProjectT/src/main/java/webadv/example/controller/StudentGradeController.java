package webadv.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import webadv.example.service.StudentGradeServiceImp;

@Controller
public class StudentGradeController {
	@Autowired
	private StudentGradeServiceImp studentGradeServiceImp;


	@GetMapping("queryResults")
	public String manageEngineRoom(Model model) {
		model.addAttribute("studentGrade_list", studentGradeServiceImp.findAllGrade());
		return "studentManager/queryResults";
	}
}
