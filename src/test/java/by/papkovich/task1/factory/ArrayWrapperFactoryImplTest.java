package by.papkovich.task1.factory;

import by.papkovich.task1.factory.impl.ArrayWrapperFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.papkovich.task1.entity.ArrayWrapper;

public class ArrayWrapperFactoryImplTest {
    @Test
    public void createWrapperShouldReturnNewInstance() {
        ArrayWrapperFactory factory = new ArrayWrapperFactoryImpl();
        int[] data = {1, 2, 3};
        ArrayWrapper wrapper = factory.createWrapper(data);
        Assertions.assertNotNull(wrapper);
        Assertions.assertArrayEquals(data, wrapper.getArray());
    }
}