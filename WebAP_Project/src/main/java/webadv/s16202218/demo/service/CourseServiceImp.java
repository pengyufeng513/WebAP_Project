package webadv.s16202218.demo.service;

import java.util.List;

import webadv.s16202218.demo.entity.BeginCourse;
import webadv.s16202218.demo.repository.OptionalCourseRepository;
import webadv.s16202218.demo.repository.SelectCourseRepository;

public class CourseServiceImp implements CourseService{
	private OptionalCourseRepository optionalCourse;
	private SelectCourseRepository selectCourse;
	@Override
	public List<BeginCourse> findAll() {
		// TODO Auto-generated method stub
		return optionalCourse.findAll();
	}
}
