package cn.yangys.mymanager.dao;

import cn.yangys.mymanager.model.TestDepartment;

public interface TestDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestDepartment record);

    int insertSelective(TestDepartment record);

    TestDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestDepartment record);

    int updateByPrimaryKey(TestDepartment record);
}