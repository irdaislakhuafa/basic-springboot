package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.ExampleData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryBeanConfigurations {
    @Primary
    @Bean
    public ExampleData data1() {
        return new ExampleData();
    }

    @Bean
    public ExampleData data2() {
        return new ExampleData();
    }
}
