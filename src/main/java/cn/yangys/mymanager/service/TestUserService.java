package cn.yangys.mymanager.service;

import java.util.List;

import cn.yangys.mymanager.model.TestUser;

public interface TestUserService {
	/**
	 * 添加用户
	 * @param testUser
	 */
	void addTestUser(TestUser testUser);
	
	/**
	 * 根据用户id获取用户
	 * @param testUserId
	 * @return
	 */
	TestUser getTestUserById(Integer testUserId);
	
	/**获取所有用户信息
     * @return List<TestUser>
     */
    List<TestUser> getAllTestUser();
    
    List<TestUser> getAllTestUser1();
    
    List<TestUser> getAllTestUser2();
    
 List<TestUser> getAllTestUser3();
    
    List<TestUser> getAllTestUser4();
}
