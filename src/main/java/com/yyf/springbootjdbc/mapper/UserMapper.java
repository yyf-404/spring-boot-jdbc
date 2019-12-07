package com.yyf.springbootjdbc.mapper;

import com.yyf.springbootjdbc.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;


public  interface UserMapper {
   // @Select("select * from user where id=${id}")
    public User getUserById(Integer id);
  //  @Options(useGeneratedKeys = true,keyProperty = "id") //配置返回自增id
   //  @Insert("insert into user (user_name,dept_id) values(#{userName},#{deptId})")
     public Integer insertUser(User user);
}
