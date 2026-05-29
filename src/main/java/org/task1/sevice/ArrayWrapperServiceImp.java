package org.task1.sevice;

import org.task1.entity.ArrayWrapper;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayWrapperServiceImp implements ArrayWrapperService{

    @Override
    public OptionalInt getMin(ArrayWrapper wrapper) {
        return OptionalInt.empty();
    }

    @Override
    public OptionalInt getMax(ArrayWrapper wrapper) {
        return OptionalInt.empty();
    }

    @Override
    public OptionalInt getSum(ArrayWrapper wrapper) {
        return OptionalInt.empty();
    }

    @Override
    public OptionalDouble getMedian(ArrayWrapper wrapper) {
        return OptionalDouble.empty();
    }

    @Override
    public void bubbleSort(ArrayWrapper wrapper) {

    }

    @Override
    public void insertionSort(ArrayWrapper wrapper) {

    }
}
