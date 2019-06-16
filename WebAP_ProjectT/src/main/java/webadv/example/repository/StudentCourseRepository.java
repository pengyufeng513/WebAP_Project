package webadv.example.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import webadv.example.entity.StudentCourse;
@Mapper
public interface StudentCourseRepository {
	@Results(id = "studentGradeMap", value = {
			 
			  @Result(property = "courseName", column = "courseName"),
			  
			  @Result(property = "courseTeacher", column = "teachername"),
			  
			  @Result(property = "courseTime", column = "begintime"),
			  
			  @Result(property = "coursePlace", column = "beginaddress")
			  })
			 
			@Select("select coursename ,teachername,begintime,beginaddress from  course,teacher,teachcourse,choosecourse where choosecourse.CourseId=teachcourse.CourseId and teachcourse.TeacherId=teacher.TeacherId and course.CourseId=teachcourse.CourseId")
			public List<StudentCourse> findAllCourse();
}
