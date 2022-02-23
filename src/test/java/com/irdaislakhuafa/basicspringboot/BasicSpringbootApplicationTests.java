package com.irdaislakhuafa.basicspringboot;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.irdaislakhuafa.basicspringboot.configurations.FirstConfiguration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class BasicSpringbootApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FirstConfiguration.class);
		assertNotNull(applicationContext);
	}

}
