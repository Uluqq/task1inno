package org.task1.factory;

import org.task1.entity.ArrayWrapper;

public class ArrayWrapperFactoryImpl implements ArrayWrapperFactory{

    @Override
    public ArrayWrapper createWrapper(int[] parsedArray) {
        return new ArrayWrapper(parsedArray);
    }
}
