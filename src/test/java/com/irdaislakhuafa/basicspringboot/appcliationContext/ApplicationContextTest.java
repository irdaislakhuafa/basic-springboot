package com.irdaislakhuafa.basicspringboot.appcliationContext;

import com.irdaislakhuafa.basicspringboot.configurations.FirstConfiguration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    // application context test
    @Test
    public void test() {
        // get annotation config
        ApplicationContext context = new AnnotationConfigApplicationContext(FirstConfiguration.class);
        Assertions.assertNotNull(context);
    }
}
