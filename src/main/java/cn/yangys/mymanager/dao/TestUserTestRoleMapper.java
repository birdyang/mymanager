package cn.yangys.mymanager.dao;

import cn.yangys.mymanager.model.TestUserTestRole;

public interface TestUserTestRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUserTestRole record);

    int insertSelective(TestUserTestRole record);

    TestUserTestRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestUserTestRole record);

    int updateByPrimaryKey(TestUserTestRole record);
}