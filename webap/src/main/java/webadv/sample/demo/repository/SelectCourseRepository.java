package webadv.sample.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import webadv.sample.demo.entity.ChooseCourse;

@Mapper
public interface SelectCourseRepository {

	@Results(id="chooseCourseMap", value={ 
		@Result(property = "CourseId", column = "CourseId"), 
		@Result(property = "StudentId", column = "StudentId")
	})

	@Select("select * from choosecourse") 
	public List<ChooseCourse> findChooseCourseAll();
}
