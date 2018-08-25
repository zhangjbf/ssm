package com.yonyou.wljt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.wljt.mapper.UserVOMapper;
import com.yonyou.wljt.pojo.UserVO;
import com.yonyou.wljt.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserVOMapper userVOMapper;

	@Override
	public List<UserVO> findAllUsers() {
		List<UserVO> list = userVOMapper.selectByExample(null);
		return list;
	}

}
