package com.irdaislakhuafa.basicspringboot.bean;

import com.irdaislakhuafa.basicspringboot.configurations.BeansConfigurations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplictaeBeanTest {
    // test duplicate bean
    @Test
    public void testDuplicateBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigurations.class);
        Assertions.assertNotNull(context);
    }
}
