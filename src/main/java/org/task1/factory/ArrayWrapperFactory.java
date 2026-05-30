package org.task1.factory;

import org.task1.entity.ArrayWrapper;

public interface ArrayWrapperFactory {
    ArrayWrapper createWrapper(int[] parsedArray);
}
