package com.irdaislakhuafa.basicspringboot;

import com.irdaislakhuafa.basicspringboot.singleton.SingletonExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    // Test singleton
    @Test
    public void testSingleton() {
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();
        Assertions.assertSame(singleton1, singleton2);
    }
}
