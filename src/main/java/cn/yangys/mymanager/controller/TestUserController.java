package cn.yangys.mymanager.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yangys.mymanager.model.TestUser;
import cn.yangys.mymanager.service.TestUserService;

@Controller
@RequestMapping("/testUser")
public class TestUserController {
	
	@Autowired
	private TestUserService testUserService;

	@RequestMapping("/listTestUser")
	public String listTestUser(HttpServletRequest request){
		List<TestUser> testUserList = testUserService.getAllTestUser();
		request.setAttribute("testUserList", testUserList);
		return "listTestUser";
	}
	
	@RequestMapping("/showTestUser")
	public String showTestUser(Integer testUserId, HttpServletRequest request){
		// http://localhost:8080/mymanager/testUser/showTestUser.do?testUserId=2
		TestUser testUser = testUserService.getTestUserById(testUserId);
		request.setAttribute("testUser", testUser);
		return "showTestUser";
	}
	
	@RequestMapping("/showTestUser1/{testUserId}")
	public String showTestUser1(@PathVariable Integer testUserId, HttpServletRequest request){
		// http://localhost:8080/mymanager/testUser/showTestUser1/2.do
		TestUser testUser = testUserService.getTestUserById(testUserId);
		request.setAttribute("testUser", testUser);
		return "showTestUser";
	}
}
