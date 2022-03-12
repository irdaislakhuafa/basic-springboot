package com.irdaislakhuafa.basicspringboot.bean;

import com.irdaislakhuafa.basicspringboot.configurations.BeansConfigurations;
import com.irdaislakhuafa.basicspringboot.data.ExampleData;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplictaeBeanTest {
    // test duplicate bean
    @Test
    public void testDuplicateBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigurations.class);
        Assertions.assertNotNull(context);

        // user data type and name of bean for select duplicate beans
        ExampleData data1 = (ExampleData) context.getBean("exampleData1");
        ExampleData data2 = context.getBean("exampleData1", ExampleData.class);

        // is they same? expected : true
        Assertions.assertSame(data1, data2);

        data2 = context.getBean("exampleData2", ExampleData.class);
        Assertions.assertNotSame(data1, data2);
    }
}
