package cn.yangys.mymanager.dao;

import java.util.List;

import cn.yangys.mymanager.model.TestUser;
import cn.yangys.mymanager.model.TestUserWithBLOBs;

public interface TestUserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(TestUserWithBLOBs record);

	int insertSelective(TestUserWithBLOBs record);

	TestUserWithBLOBs selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(TestUserWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(TestUserWithBLOBs record);

	int updateByPrimaryKey(TestUser record);

	/**
	 * 获取所有用户信息
	 * 
	 * @return List<TestUser>
	 */
	List<TestUser> getAllTestUser();
}