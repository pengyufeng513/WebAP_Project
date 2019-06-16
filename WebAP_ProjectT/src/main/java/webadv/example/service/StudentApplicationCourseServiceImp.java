package webadv.example.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webadv.example.entity.StudentApplicationCourse;
import webadv.example.repository.StudentApplicationCourseRepository;
@Service
public class StudentApplicationCourseServiceImp implements StudentApplicationCourseService{
	@Autowired
	private  StudentApplicationCourseRepository sc;
	
	@Override
	public List<StudentApplicationCourse> findAllApplicationCourse() {
		// TODO Auto-generated method stub
		return sc.findAllApplicationCourse();
	}

	@Override
	public int AddCourse(String courseName) {
		// TODO Auto-generated method stub
		return sc.AddCourse(courseName);
	}

	@Override
	public int CheckCourse(String courseName) {
		// TODO Auto-generated method stub
		return sc.CheckCourse(courseName);
	}


	
}


