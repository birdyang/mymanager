package cn.yangys.mymanager.test;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yangys.mymanager.model.TestUser;
import cn.yangys.mymanager.service.TestUserService;

public class MyBatisTest {
	
	private TestUserService testUserService;
	
	/**
     * 这个before方法在所有的测试方法之前执行，并且只执行一次
     * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
     * 比如在before方法里面初始化ApplicationContext和userService
     */
    @Before
    public void before(){
        //使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        //从Spring容器中根据bean的id取出我们要使用的userService对象
        testUserService = (TestUserService) ac.getBean("testUserService");
    }
    
    @Test
    public void testAddUser(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        //UserServiceI userService = (UserServiceI) ac.getBean("userService");
        TestUser testUser = new TestUser();
        testUser.setId(1);
        testUser.setLogin("admin@comapny.com");
        testUser.setFirstname("Yang");
        testUser.setLastname("Bino");
        Calendar instance = Calendar.getInstance();
        instance.set(1990, 10, 1);
        testUser.setBirthday(instance.getTime());
        testUserService.addTestUser(testUser);
    }

}
