package org.task1.service;

import org.task1.entity.ArrayWrapper;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayWrapperServiceImp implements ArrayWrapperService{

    @Override
    public OptionalInt getMin(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length == 0){
            return OptionalInt.empty();
        }
        int min = array[0];
        for (int a : array) {
            if (a < min){
                min = a;
            }
        }
        return OptionalInt.of(min);
    }

    @Override
    public OptionalInt getMax(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length == 0){
            return OptionalInt.empty();
        }
        int max = array[0];
        for (int a : array) {
            if (a > max){
                max = a;
            }
        }
        return OptionalInt.of(max);
    }

    @Override
    public OptionalInt getSum(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length == 0){
            return OptionalInt.empty();
        }
        int sum = 0;
        for (int a : array) {
            sum +=  a;
        }
        return OptionalInt.of(sum);
    }

    @Override
    public OptionalDouble getAverage(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length == 0){
            return OptionalDouble.empty();
        }
        int sum = 0;
        for (int a : array) {
            sum +=  a;
        }
        double avg = (double) sum / array.length;
        return OptionalDouble.of(avg);
    }

    @Override
    public void bubbleSort(ArrayWrapper wrapper) {

    }

    @Override
    public void insertionSort(ArrayWrapper wrapper) {

    }
}
