package webadv.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webadv.example.entity.StudentCourse;
import webadv.example.repository.StudentCourseRepository;
@Service
public class StudentCourseServiceImp implements StudentQueryCouseService{
	@Autowired
	private  StudentCourseRepository sr;
	@Override
	public List<StudentCourse> findAllCourse() {
		return sr.findAllCourse();
		
	}

}
