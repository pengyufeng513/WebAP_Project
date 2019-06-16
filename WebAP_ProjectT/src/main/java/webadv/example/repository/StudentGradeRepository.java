package webadv.example.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import webadv.example.entity.StudentGrade;
@Mapper
public interface StudentGradeRepository {

	
	 @Results(id = "studentGradeMap", value = {
	 
	  @Result(property = "gradeId", column = "GradeId", jdbcType =
	  JdbcType.INTEGER),
	  
	  @Result(property = "courseTerm", column = "CourseTerm"),
	  
	  @Result(property = "courseId", column = "courseId",jdbcType =
			  JdbcType.INTEGER),
	  
	  @Result(property = "courseGrades", column = "courseGrades",jdbcType =
			  JdbcType.INTEGER),
	  @Result(property = "courseGrade", column = "courseGrade",jdbcType =
			  JdbcType.INTEGER),
	  @Result(property = "courseStudyTime", column = "courseStudyTime",jdbcType =
			  JdbcType.INTEGER),
	  @Result(property = "courseType", column = "courseType"),
	  
	  })
	 
	@Select("select * from grade")
	public List<StudentGrade> findAllGrades();
}
