package webadv.example.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webadv.example.entity.StudentGrade;
import webadv.example.repository.StudentGradeRepository;
@Service
public class StudentGradeServiceImp implements StudentGradeService{
	@Autowired
	private  StudentGradeRepository sr;
	@Override
	public List<StudentGrade> findAllGrade() {
		// TODO Auto-generated method stub
		return sr.findAllGrades();
	}
	
}
