package webadv.example.service;

import java.util.List;
import webadv.example.entity.StudentApplicationCourse;
public interface StudentApplicationCourseService {
	public List<StudentApplicationCourse> findAllApplicationCourse();
	public int AddCourse(String coureName);
	public int CheckCourse(String coureName);
}
