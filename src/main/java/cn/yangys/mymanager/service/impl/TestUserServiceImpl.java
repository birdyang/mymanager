package cn.yangys.mymanager.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yangys.mymanager.dao.TestUserMapper;
import cn.yangys.mymanager.model.TestUser;
import cn.yangys.mymanager.model.TestUserWithBLOBs;
import cn.yangys.mymanager.service.TestUserService;

/**
 * 使用@Service注解将TestUserServiceImpl类标注为一个service
 * service的id是testUserService
 * @author yangys
 *
 */
@Service("testUserService")
public class TestUserServiceImpl implements TestUserService {

	/**
     * 使用@Autowired注解标注userMapper变量，
     * 当需要使用UserMapper时，Spring就会自动注入UserMapper
     */
	@Autowired
	private TestUserMapper testUserMapper;//注入dao
	
	@Override
	public void addTestUser(TestUser testUser) {
		TestUserWithBLOBs testUserWithBLOBs = new TestUserWithBLOBs();
		BeanUtils.copyProperties(testUser, testUserWithBLOBs);
		testUserMapper.insertSelective(testUserWithBLOBs);
	}

	@Override
	public TestUser getTestUserById(Integer testUserId) {
		return testUserMapper.selectByPrimaryKey(testUserId);
	}

	@Override
	public List<TestUser> getAllTestUser() {
		return testUserMapper.getAllTestUser();
	}

	@Override
	public List<TestUser> getAllTestUser1() {
		return testUserMapper.getAllTestUser1();
	}
	
	@Override
	public List<TestUser> getAllTestUser2() {
		return testUserMapper.getAllTestUser2();
	}
	
	@Override
	public List<TestUser> getAllTestUser3() {
		return testUserMapper.getAllTestUser3();
	}
	@Override
	public List<TestUser> getAllTestUser4() {
		return testUserMapper.getAllTestUser4();
	}
	

}
