package com.highlion.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.highlion.entity.User;

@Mapper
public interface UserMapper {
	@Select("select *from user where id=#{id}")
  public User findById(int id);
}
