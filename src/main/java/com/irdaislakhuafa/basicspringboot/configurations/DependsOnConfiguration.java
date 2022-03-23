package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.Bar;
import com.irdaislakhuafa.basicspringboot.data.Foo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    @Bean(name = { "thisIsBeanFoo" })
    public Foo foo() {
        log.info("Bean with name \"foo\" is created!");
        return new Foo();
    }

    @Bean(name = { "thisIsBeanBar" })
    public Bar bar() {
        log.info("Bean with name \"foo\" is created!");
        return new Bar();
    }
}
