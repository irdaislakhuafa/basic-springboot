package com.irdaislakhuafa.tests;

import com.irdaislakhuafa.basicspringboot.configurations.CustomScopeConfiguration;
import com.irdaislakhuafa.basicspringboot.data.Foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomScopeTest {
    private ApplicationContext context = new AnnotationConfigApplicationContext(CustomScopeConfiguration.class);

    @Test
    public void testCustomScope() {
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);
        Foo foo4 = context.getBean(Foo.class);

      // assert not same
        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo3, foo4);

        // assert same
        Assertions.assertSame(foo1, foo3);
        Assertions.assertSame(foo2, foo4);
    }
}
