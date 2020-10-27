package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    List<Product> selectListByCateId (@Param("CateId") Product product);
    int insert(@Param("product") Product product);
}
