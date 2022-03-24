package com.irdaislakhuafa.basicspringboot.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class DoubletonScope implements Scope {
    private int counter = -1;

    private List<Object> list = new ArrayList<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        counter++;
        if (list.size() >= 2) {
            return list.get((counter % 2));
        } else {
            Object object = objectFactory.getObject();
            list.add(object);
            return object;
        }
    }

    @Override
    public Object remove(String name) {
        return (list.size() != 0) ? list.remove(0) : null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }

}
