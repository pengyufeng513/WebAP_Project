package webadv.example.repository;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;

import webadv.example.entity.StudentApplicationCourse;

@Mapper
public interface StudentApplicationCourseRepository {

	@Results(id = "studentApplicationCourseMap", value = {

			@Result(property = "courseName", column = "coursename"),
			@Result(property = "courseCredit", column = "courseCredit", jdbcType = JdbcType.INTEGER),
			@Result(property = "courseTeacher", column = "teachername"),
			@Result(property = "coursePlace", column = "beginaddress"),
			@Result(property = "courseTime", column = "begintime"), })
	@Select("select coursename,courseCredit,teachername,beginaddress,begintime from course,teacher,teachcourse where course.CourseId=teachcourse.courseId and teacher.TeacherId=teachcourse.teacherId ")
	public List<StudentApplicationCourse> findAllApplicationCourse();
	@Select("select count(1) from choosecourse where courseId in(select courseId from course where courseName=#{courseName})")
	public int CheckCourse(@Param("courseName") String courseName);	
	@Insert("insert into choosecourse(courseid,studentId) values((select courseId from course where courseName=#{courseName} limit 1),'1')")
	public int AddCourse(@Param("courseName") String courseName);

}
