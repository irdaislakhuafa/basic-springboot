package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.ExampleData;
import com.irdaislakhuafa.basicspringboot.helpers.TextColor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j // Simple Logging Facade for Java
@Configuration
public class BeansConfigurations {
    // create bean with type ExampleData
    @Bean
    public ExampleData exampleData() {
        log.error(TextColor.fgBLUE("Create bean with type ExampleData.class"));
        return new ExampleData();
    }
}
