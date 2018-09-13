package com.lyscharlie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.lyscharlie.test.domain.MyUserDO;
import com.lyscharlie.test.service.MyUserService;

public class Run {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext(new String[] { "classpath:application-context.xml" });

		MyUserService myUserService = (MyUserService) act.getBean("myUserService");

		MyUserDO user = myUserService.queryUserById(1L);
		Gson gson = new Gson();
		String json = gson.toJson(user);

		System.out.println(json);
	}

}
