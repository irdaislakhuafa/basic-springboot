package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.Bar;
import com.irdaislakhuafa.basicspringboot.data.Foo;
import com.irdaislakhuafa.basicspringboot.data.FooBar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDependencyInjectionConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Bar bar, Foo foo) {
        return FooBar.builder().bar(bar).foo(foo).build();
    }
}
