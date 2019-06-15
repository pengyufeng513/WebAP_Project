package webadv.s16202218.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import webadv.s16202218.demo.entity.EducManager;

public interface EducManagerRepository {
	@Results(id="educManagerMap", value={ 
		@Result(property = "id", column = "AdminId"), 
		@Result(property = "password", column = "AdminPassword"),
		@Result(property = "name", column = "AdminName"),
		@Result(property = "sex", column = "AdminSex"),
		@Result(property = "born", column = "AdminBorn"),
	})

	@Select("select * from EducManager") 
	public List<EducManager> findAll();
			
	@Select("select * from EducManager where AdminId=#{account} and AdminPassword=md5(#{password})")
	@ResultMap(value="educManagerMap")
	public EducManager validEducManager(@Param("id")String account,@Param("password")String password);
			
	@Select("select * from EducManager where AdminName like concat('%',#{name},'%')")
	@ResultMap(value="educManagerMap")			
	public List<EducManager> findByName(@Param("name")String name);
}
