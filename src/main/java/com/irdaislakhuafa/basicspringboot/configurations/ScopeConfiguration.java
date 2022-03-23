package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.Foo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class ScopeConfiguration {
    @Bean
    @Scope(value = "prototype")
    public Foo scopeFoo() {
        log.info("Create new Foo");
        return new Foo();
    }
}
