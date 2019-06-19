package webadv.sample.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import webadv.sample.demo.entity.TeachCourse;

@Mapper
public interface TeachCourseRepository {

	@Results(id="teachCourseMap", value={ 
		@Result(property = "TeacherId", column = "TeacherId"), 
		@Result(property = "CourseId", column = "CourseId"),
		@Result(property = "CourseTerm", column = "CourseTerm"),
		@Result(property = "BeginTime", column = "BeginTime"),
		@Result(property = "BeginAddress", column = "BeginAddress")
	})

	@Select("select * from teachcourse") 
	public List<TeachCourse> findTeachCourseAll();
	@Select("select * from teachcourse where BeginTime=''") 
	public List<TeachCourse> findTeachCourseTimeAll();
	@Select("select * from teachcourse where BeginAddress=''") 
	public List<TeachCourse> findTeachCourseAddressAll();
	@Update("update teachcourse set BeginAddress=#{BeginAddress} where CourseId=#{CourseId} and TeacherId=#{TeacherId} and CourseTerm=#{CourseTerm}")
	public void UpdateTeachCourseAddress(@Param("TeacherId") String TeacherId, @Param("CourseId") String CourseId, @Param("CourseTerm") String CourseTerm, @Param("BeginAddress") String BeginAddress);
	@Update("update teachcourse set BeginTime=#{BeginTime} where CourseId=#{CourseId} and TeacherId=#{TeacherId} and CourseTerm=#{CourseTerm}")
	public void UpdateTeachCourseTime(@Param("TeacherId") String TeacherId, @Param("CourseId") String CourseId, @Param("CourseTerm") String CourseTerm, @Param("BeginTime") String BeginTime);
}
