package com.meng.dao;

import com.meng.model.TestUser;

public interface TestUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);
}