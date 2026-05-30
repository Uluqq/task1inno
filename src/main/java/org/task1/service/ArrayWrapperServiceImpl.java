package org.task1.service;

import org.task1.entity.ArrayWrapper;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayWrapperServiceImpl implements ArrayWrapperService{

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
        int[] array = wrapper.getArray();
        if (array == null || array.length < 2){
            return;
        }
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        wrapper.setArray(array);
    }

    @Override
    public void insertionSort(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length < 2){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        wrapper.setArray(array);
    }
}
