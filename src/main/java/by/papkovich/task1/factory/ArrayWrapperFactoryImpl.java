package by.papkovich.task1.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.papkovich.task1.entity.ArrayWrapper;

public class ArrayWrapperFactoryImpl implements ArrayWrapperFactory{

    private static final Logger logger = LogManager.getLogger(ArrayWrapperFactoryImpl.class);

    @Override
    public ArrayWrapper createWrapper(int[] parsedArray) {
        ArrayWrapper wrapper = new ArrayWrapper(parsedArray);
        logger.info("Successfully created ArrayWrapper with array of size: {}", parsedArray.length);
        return wrapper;
    }
}
