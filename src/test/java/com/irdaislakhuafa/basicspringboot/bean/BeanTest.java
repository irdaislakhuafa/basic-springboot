package com.irdaislakhuafa.basicspringboot.bean;

import com.irdaislakhuafa.basicspringboot.configurations.BeansConfigurations;
import com.irdaislakhuafa.basicspringboot.data.ExampleData;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    // test bean
    @Test
    public void testBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigurations.class);
        Assertions.assertNotNull(context);
        ExampleData exampleData1 = context.getBean(ExampleData.class);
    }

    // test get bean
    @Test
    public void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigurations.class);

        // get bean from BeansConfiguraions.class with type ExampleData
        ExampleData exampleData1 = context.getBean(ExampleData.class);
        ExampleData exampleData2 = context.getBean(ExampleData.class);

        // is they are same?
        Assertions.assertEquals(exampleData1, exampleData2);
    }
}