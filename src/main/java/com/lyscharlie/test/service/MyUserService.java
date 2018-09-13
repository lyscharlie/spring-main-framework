package com.lyscharlie.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lyscharlie.test.dao.MyUserDao;
import com.lyscharlie.test.domain.MyUserDO;

public class MyUserService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MyUserDao myUserDao;

	public MyUserDO queryUserById(Long id) {
		try {
			return this.myUserDao.selectById(id);
		} catch (Exception e) {
			logger.error("call MyUserService.queryUserById error", e);
			return null;
		}
	}

}
