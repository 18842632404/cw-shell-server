package com.cw.shell.cwshellserver.dao;

import com.cw.shell.cwshellserver.model.po.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("select * from cw_shell_product")
    List<Product> getAll();
}
