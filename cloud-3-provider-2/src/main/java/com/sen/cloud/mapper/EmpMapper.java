package com.sen.cloud.mapper;

import com.sen.cloud.bean.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface EmpMapper {

    @Select("select * from emp where id = #{id}")
    Emp get(long id);

    //useGeneratedKeys是否使用自增主键，keyProperty指定实体类中的哪一个属性封装主键值
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into emp(name) values(#{name})")
    int addEmp(Emp emp);
}
