package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.data.ExampleData;
import com.irdaislakhuafa.basicspringboot.helpers.TextColor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j // Simple Logging Facade for Java
@Configuration
public class DuplicateBeanConfigurations {
    // create bean with type ExampleData

    /*
     * use this annotation for primary bean if have more than one bean with same
     * type
     */
    @Bean(value = { "duplicateData1" })
    public ExampleData exampleData1() {
        log.info(TextColor.fgBLUE("Create bean with type ExampleData.class"));
        return new ExampleData();
    }

    @Bean(value = { "duplicateData2" })
    public ExampleData exampleData2() {
        return new ExampleData();
    }

    /*
     * if you use @Bean(name ="customBeanName") you can't call than bean by name
     * with context.getBean("beanName", Bean.class)
     * you must use @Qualifier(value = "customBeanName") to call it but jus can be
     * used for @Autowired
     */
}
