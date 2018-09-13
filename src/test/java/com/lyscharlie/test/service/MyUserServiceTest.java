package com.lyscharlie.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lyscharlie.test.domain.MyUserDO;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class MyUserServiceTest extends TestCase {

	@Autowired
	private MyUserService myUserService;

	@Test
	public void testQueryUserById() {
		long id = 1L;
		MyUserDO user = this.myUserService.queryUserById(id);

		assertTrue(null != user);
	}

}
