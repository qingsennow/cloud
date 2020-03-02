package com.sen.cloud.mapper;

import com.sen.cloud.bean.Emp;
import com.sen.cloud.bean.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface ProductMapper {

    @Select("select * from product where id = #{id}")
    Product get(long id);

    //useGeneratedKeys是否使用自增主键，keyProperty指定实体类中的哪一个属性封装主键值
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into product(product_name) values(#{productName})")
    int add(Product emp);

    @Select("select * from product")
    List<Product> getAll();
}
