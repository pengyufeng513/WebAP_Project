package webadv.sample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webadv.sample.demo.entity.BeginCourse;
import webadv.sample.demo.entity.ChooseCourse;
import webadv.sample.demo.entity.TeachCourse;
import webadv.sample.demo.repository.OptionalCourseRepository;
import webadv.sample.demo.repository.SelectCourseRepository;
import webadv.sample.demo.repository.TeachCourseRepository;

@Service
public class CourseServiceImp implements CourseService{
	@Autowired
	private OptionalCourseRepository optionalCourse;
	@Autowired
	private SelectCourseRepository selectCourse;
	@Autowired
	private TeachCourseRepository teachCourse;
	
	@Override
	public List<BeginCourse> findBeginCourseAll() {
		// TODO Auto-generated method stub
		return optionalCourse.findBeginCourseAll();
	}
	@Override
	public void UpdateBeginCourse(String TeacherId, String CourseId, String CourseTerm) {
		// TODO Auto-generated method stub
		optionalCourse.UpdateBeginCourse(TeacherId, CourseId, CourseTerm);
	}
	@Override
	public void AddTeachCourse(String TeacherId, String CourseId, String CourseTerm) {
		// TODO Auto-generated method stub
		optionalCourse.AddTeachCourse(TeacherId, CourseId, CourseTerm);
	}
	
	@Override
	public List<ChooseCourse> findChooseCourseAll() {
		// TODO Auto-generated method stub
		return selectCourse.findChooseCourseAll();
	}
	@Override
	public List<TeachCourse> findTeachCourseAll() {
		// TODO Auto-generated method stub
		return teachCourse.findTeachCourseAll();
	}
	@Override
	public void UpdateTeachCourseAddress(String TeacherId, String CourseId,  String CourseTerm, String BeginAddress) {
		// TODO Auto-generated method stub
		teachCourse.UpdateTeachCourseAddress(TeacherId, CourseId, CourseTerm, BeginAddress);
	}
	@Override
	public void UpdateTeachCourseTime(String TeacherId, String CourseId,  String CourseTerm, String BeginTime) {
		// TODO Auto-generated method stub
		teachCourse.UpdateTeachCourseTime(TeacherId, CourseId, CourseTerm, BeginTime);
	}
	@Override
	public List<TeachCourse> findTeachCourseTimeAll() {
		// TODO Auto-generated method stub
		return teachCourse.findTeachCourseTimeAll();
	}
	@Override
	public List<TeachCourse> findTeachCourseAddressAll() {
		// TODO Auto-generated method stub
		return teachCourse.findTeachCourseAddressAll();
	}
	
}
