package com.lyscharlie.test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lyscharlie.test.domain.MyUserDO;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class MyUserDaoTest extends TestCase {

	@Autowired
	private MyUserDao myUserDao;

	@Test
	public void testSelectById() {
		long id = 1L;
		MyUserDO user = this.myUserDao.selectById(id);

		assertTrue(null != user);
	}

}
