package com.irdaislakhuafa.basicspringboot.singleton;

public class SingletonExample {
    private static SingletonExample singletonExample = new SingletonExample();

    public static SingletonExample getInstance() {
        return singletonExample;
    }

    private SingletonExample() {
    }
}
