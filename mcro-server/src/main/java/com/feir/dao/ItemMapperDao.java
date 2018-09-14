package com.feir.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import com.feir.bean.Item;

@Mapper
public interface ItemMapperDao {
 Item findItemById(Long id);
}
