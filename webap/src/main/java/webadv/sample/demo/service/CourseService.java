package webadv.sample.demo.service;

import java.util.List;

import webadv.sample.demo.entity.BeginCourse;
import webadv.sample.demo.entity.ChooseCourse;
import webadv.sample.demo.entity.TeachCourse;

public interface CourseService {
	public List<BeginCourse> findBeginCourseAll();
	public void UpdateBeginCourse(String TeacherId, String CourseId, String CourseTerm);
	public void AddTeachCourse(String TeacherId, String CourseId, String CourseTerm);
	public List<ChooseCourse> findChooseCourseAll();
	public List<TeachCourse> findTeachCourseAll();
	public List<TeachCourse> findTeachCourseTimeAll();
	public List<TeachCourse> findTeachCourseAddressAll();
	public void UpdateTeachCourseAddress(String TeacherId, String CourseId,  String CourseTerm, String BeginAddress);
	public void UpdateTeachCourseTime(String TeacherId, String CourseId,  String CourseTerm, String BeginTime);
}
