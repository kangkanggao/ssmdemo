package com.highlion.dao;



import org.apache.ibatis.annotations.Param;

import com.highlion.entity.User;

public interface UserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    User findByUsernameAndPassword(@Param("username")String username,@Param("password") String password);
}