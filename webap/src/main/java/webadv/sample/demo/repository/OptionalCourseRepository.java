package webadv.sample.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import webadv.sample.demo.entity.BeginCourse;

@Mapper
public interface OptionalCourseRepository {

	@Results(id="beginCourseMap", value={ 
		@Result(property = "TeacherId", column = "TeacherId"), 
		@Result(property = "CourseId", column = "CourseId"),
		@Result(property = "CourseTerm", column = "CourseTerm"),
		@Result(property = "CourseWhether", column = "CourseWhether")
	})

	@Select("select * from begincourse where CourseWhether = 'false'") 
	public List<BeginCourse> findBeginCourseAll();
	
	@Update("update begincourse set CourseWhether='true' where TeacherId=#{TeacherId} and CourseId=#{CourseId} and CourseTerm=#{CourseTerm}")
	public void UpdateBeginCourse(@Param("TeacherId") String TeacherId,@Param("CourseId") String CourseId,@Param("CourseTerm") String CourseTerm);
	
	@Insert("insert into teachcourse values(#{TeacherId},#{CourseId},#{CourseTerm},'','')")
	public void AddTeachCourse(@Param("TeacherId")String TeacherId,@Param("CourseId")String CourseId,@Param("CourseTerm")String CourseTerm);
}
