package com.yonyou.wljt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.wljt.pojo.UserVO;
import com.yonyou.wljt.service.IUserService;

@RestController
public class UserContorller {

	@Autowired
	private IUserService userService;

	@RequestMapping("/users")
	public List<UserVO> getUsers() {
		return userService.findAllUsers();
	}

}
