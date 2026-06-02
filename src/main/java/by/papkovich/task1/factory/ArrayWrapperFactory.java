package by.papkovich.task1.factory;

import by.papkovich.task1.entity.ArrayWrapper;

public interface ArrayWrapperFactory {
    ArrayWrapper createWrapper(int[] parsedArray);
}
