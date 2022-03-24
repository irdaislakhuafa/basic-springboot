package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.Foo;
import com.irdaislakhuafa.basicspringboot.scope.DoubletonScope;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class CustomScopeConfiguration {
    @Bean(name = { "MyCustomScope" })
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @DependsOn(value = { "MyCustomScope" })
    @Scope(value = "doubleton")
    @Bean(name = { "FooCustomScope" })
    public Foo foo() {
        log.info("Create new Foo with Doubleton", null, log);
        return new Foo();
    }
}
