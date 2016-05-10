package cn.yangys.mymanager.dao;

import cn.yangys.mymanager.model.TestRole;

public interface TestRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestRole record);

    int insertSelective(TestRole record);

    TestRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestRole record);

    int updateByPrimaryKey(TestRole record);
}