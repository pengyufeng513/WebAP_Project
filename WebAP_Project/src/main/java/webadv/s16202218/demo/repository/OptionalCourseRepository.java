package webadv.s16202218.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import webadv.s16202218.demo.entity.BeginCourse;

@Mapper
public interface OptionalCourseRepository {

	@Results(id="beginCourseMap", value={ 
		@Result(property = "TeacherId", column = "TeacherId"), 
		@Result(property = "CourseId", column = "CourseId"),
		@Result(property = "CourseTerm", column = "CourseTerm"),
	})

	@Select("select * from begincourse") 
	public List<BeginCourse> findAll();
}
