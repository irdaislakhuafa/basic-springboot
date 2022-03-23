package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.ExampleData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurations {
    @Bean
    public ExampleData exampleData1() {
        return new ExampleData();
    }

    @Bean
    public ExampleData exampleData2() {
        return new ExampleData();
    }
}
