package com.irdaislakhuafa.dependsOnAndLazyBean;

import com.irdaislakhuafa.basicspringboot.configurations.DependsOnConfiguration;
import com.irdaislakhuafa.basicspringboot.data.Foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnAndLazyBean {
    private ApplicationContext context;

    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    public void test() {
        Foo foo = context.getBean("thisIsBeanFoo", Foo.class);
        Assertions.assertNotNull(foo);
    }
}
