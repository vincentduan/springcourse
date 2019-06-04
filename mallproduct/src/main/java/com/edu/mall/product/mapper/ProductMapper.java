package com.edu.mall.product.mapper;

import com.edu.mall.product.bean.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Insert("insert into products (pname,type,price) values (#{pname}, #{type}, #{price})")
    public Integer add(Product product);

    @Delete("delete from products where pid=#{arg1}")
    public Integer deleteById(Integer pid);

    @Update("update products set pname=#{pname}, type=#{type}, price=#{price} where pid=#{pid}")
    public Integer update(Product product);

    @Select("select * from products where pid=#{arg1}")
    public Product getById(Integer pid);

    @Select("select * from products order by pid desc")
    public List<Product> queryByList();
}
