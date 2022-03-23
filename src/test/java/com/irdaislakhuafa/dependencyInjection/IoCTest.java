package com.irdaislakhuafa.dependencyInjection;

import com.irdaislakhuafa.basicspringboot.configurations.BeanDependencyInjectionConfiguration;
import com.irdaislakhuafa.basicspringboot.data.Bar;
import com.irdaislakhuafa.basicspringboot.data.Foo;
import com.irdaislakhuafa.basicspringboot.data.FooBar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCTest {
    private ApplicationContext context;

    @BeforeEach
    private void setUp() {
        context = new AnnotationConfigApplicationContext(BeanDependencyInjectionConfiguration.class);
    }

    @Test
    public void testIoC() {
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);
        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertEquals(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
