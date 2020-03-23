package com.douzone.container.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.user.User;

import config.user.AppConfig01;

public class JavaConfigTest {

	@Ignore
	@Test
	public void testJavaConfig01() {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig01.class);
		User user = appContext.getBean(User.class);
		
		assertNotNull(user);
		assertEquals("이삼사", user.getName());
		((ConfigurableApplicationContext)appContext).close();
	}
	
	@Test
	public void testJavaConfig02() {
		ApplicationContext appContext = new AnnotationConfigApplicationContext("config.user");
		User user = appContext.getBean(User.class);

		assertNotNull(user);
		assertEquals("오륙칠", user.getName());
		((ConfigurableApplicationContext)appContext).close();
	}
}
