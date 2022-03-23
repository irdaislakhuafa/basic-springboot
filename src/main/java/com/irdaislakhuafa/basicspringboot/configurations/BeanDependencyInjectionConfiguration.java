package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.Bar;
import com.irdaislakhuafa.basicspringboot.data.Foo;
import com.irdaislakhuafa.basicspringboot.data.FooBar;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanDependencyInjectionConfiguration {
    @Bean
    @Primary
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Bar bar, @Qualifier(value = "fooSecond") Foo foo) {
        return FooBar.builder().bar(bar).foo(foo).build();
    }
}
