package by.papkovich.task1.service;

import by.papkovich.task1.entity.ArrayWrapper;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ArrayWrapperService {
    OptionalInt getMin(ArrayWrapper wrapper);
    OptionalInt getMax(ArrayWrapper wrapper);
    OptionalInt getSum(ArrayWrapper wrapper);
    OptionalDouble getAverage(ArrayWrapper wrapper);
    void bubbleSort(ArrayWrapper wrapper);
    void insertionSort(ArrayWrapper wrapper);
}
