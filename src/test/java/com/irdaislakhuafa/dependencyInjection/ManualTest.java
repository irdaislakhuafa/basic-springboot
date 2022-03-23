package com.irdaislakhuafa.dependencyInjection;

import com.irdaislakhuafa.basicspringboot.data.Bar;
import com.irdaislakhuafa.basicspringboot.data.Foo;
import com.irdaislakhuafa.basicspringboot.data.FooBar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManualTest {
    // private ApplicationContext context;

    // @BeforeEach
    // public void init() {
    // context = new
    // AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);

    // }

    @Test
    public void testManual() {
        Foo foo = new Foo();
        Bar bar = new Bar();
        FooBar fooBar = new FooBar(foo, bar);

        // is foo and fooBar.getFoo() is same?
        Assertions.assertEquals(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
