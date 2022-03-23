package com.irdaislakhuafa.tests;

import com.irdaislakhuafa.basicspringboot.configurations.ScopeConfiguration;
import com.irdaislakhuafa.basicspringboot.data.Foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
    private ApplicationContext context;

    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    public void test() {
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo2, foo3);
        Assertions.assertNotSame(foo3, foo1);
    }
}
