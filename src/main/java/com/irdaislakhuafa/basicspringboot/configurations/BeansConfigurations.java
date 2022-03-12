package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.ExampleData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfigurations {
    // create bean with type ExampleData
    @Bean
    public ExampleData exampleData() {
        return new ExampleData();
    }
}
