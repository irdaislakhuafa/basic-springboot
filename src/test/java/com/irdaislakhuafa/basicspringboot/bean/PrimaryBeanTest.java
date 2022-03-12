package com.irdaislakhuafa.basicspringboot.bean;

import com.irdaislakhuafa.basicspringboot.configurations.BeansConfigurations;
import com.irdaislakhuafa.basicspringboot.data.ExampleData;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {
    private ApplicationContext context;

    /*
     * use annotation @BeforeEach to execute this function if each methods test is
     * called
     */
    @BeforeEach
    public void init() {
        context = new AnnotationConfigApplicationContext(BeansConfigurations.class);
    }

    // test primary bean
    @Test
    public void testPrimaryBean() {
        ExampleData data = context.getBean(ExampleData.class); // this will get primary bean
        ExampleData data1 = (ExampleData) context.getBean("exampleData1"); // get bean with name "exampleData1"
        ExampleData data2 = context.getBean("exampleData2", ExampleData.class); // get bean "exampleData2"

        // is data and data1 is same? expected : true
        Assertions.assertSame(data, data1);
        Assertions.assertNotSame(data, data2);
        Assertions.assertNotSame(data1, data2);
    }

}
