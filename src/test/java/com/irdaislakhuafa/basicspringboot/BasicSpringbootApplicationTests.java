package com.irdaislakhuafa.basicspringboot;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.irdaislakhuafa.basicspringboot.configurations.FirstConfiguration;
import com.irdaislakhuafa.basicspringboot.singleton.SingletonExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class BasicSpringbootApplicationTests {

	// @Test
	// void contextLoads() {
	// ApplicationContext applicationContext = new
	// AnnotationConfigApplicationContext(FirstConfiguration.class);
	// assertNotNull(applicationContext);
	// }

	@Test
	void testSingleton() {
		var singleton1 = SingletonExample.getInstance();
		var singleton2 = SingletonExample.getInstance();
		Assertions.assertSame(singleton1, singleton2);
	}

}
