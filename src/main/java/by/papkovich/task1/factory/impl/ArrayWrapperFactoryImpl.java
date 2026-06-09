package by.papkovich.task1.factory.impl;

import by.papkovich.task1.factory.ArrayWrapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.papkovich.task1.entity.ArrayWrapper;

public class ArrayWrapperFactoryImpl implements ArrayWrapperFactory {

    private static final Logger logger = LogManager.getLogger(ArrayWrapperFactoryImpl.class);

    @Override
    public ArrayWrapper createWrapper(int[] parsedArray) {
        ArrayWrapper wrapper = new ArrayWrapper(parsedArray);
        logger.info("Successfully created ArrayWrapper with array of size: {}", wrapper.getLength());

        wrapper.notifyObservers();
        return wrapper;
    }
}
