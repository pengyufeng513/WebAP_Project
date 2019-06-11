package webadv.s16202218.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import webadv.s16202218.demo.entity.Manage;

@Mapper
public interface ManageRepository {
	
	@Results(id="teacherMap", value={ 
		@Result(property = "id", column = "teacher_id",  jdbcType=JdbcType.INTEGER), 
		@Result(property = "account", column = "teacher_account"),
		@Result(property = "name", column = "teacher_name")
	})

	@Select("select * from t_teacher") 
	public List<Manage> findAll();
	
	@Select("select * from t_teacher where teacher_account=#{account} and teacher_password=md5(#{password})")
	@ResultMap(value="teacherMap")
	public Manage validTeacher(@Param("account")String account,@Param("password")String password);
	
	@Select("select * from t_teacher where teacher_name like concat('%',#{name},'%')")
	@ResultMap(value="teacherMap")			
	public List<Manage> findByName(@Param("name")String name);
}

