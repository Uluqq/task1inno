package by.papkovich.task1.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.papkovich.task1.entity.ArrayWrapper;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayWrapperServiceImpl implements ArrayWrapperService{

    private static final Logger logger = LogManager.getLogger(ArrayWrapperServiceImpl.class);

    @Override
    public OptionalInt getMin(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length == 0){
            logger.warn("Attempted to find min value in an empty or null array");
            return OptionalInt.empty();
        }
        int min = array[0];
        for (int a : array) {
            if (a < min){
                min = a;
            }
        }
        logger.info("Calculated minimum value: {}", min);
        return OptionalInt.of(min);
    }

    @Override
    public OptionalInt getMax(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length == 0){
            logger.warn("Attempted to find min value in an empty or null array");
            return OptionalInt.empty();
        }
        int max = array[0];
        for (int a : array) {
            if (a > max){
                max = a;
            }
        }
        logger.info("Calculated maximum value: {}", max);
        return OptionalInt.of(max);
    }

    @Override
    public OptionalInt getSum(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length == 0){
            logger.warn("Attempted to find min value in an empty or null array");
            return OptionalInt.empty();
        }
        int sum = 0;
        for (int a : array) {
            sum +=  a;
        }
        logger.info("Calculated sum: {}", sum);
        return OptionalInt.of(sum);
    }

    @Override
    public OptionalDouble getAverage(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length == 0){
            logger.warn("Attempted to find min value in an empty or null array");
            return OptionalDouble.empty();
        }
        int sum = 0;
        for (int a : array) {
            sum +=  a;
        }
        double avg = (double) sum / array.length;
        logger.info("Calculated average: {}", avg);
        return OptionalDouble.of(avg);
    }

    @Override
    public void bubbleSort(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length < 2){
            logger.info("Array is empty or has one element, sorting skipped");
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
        logger.info("Array successfully sorted using Bubble Sort");
        wrapper.setArray(array);
    }

    @Override
    public void insertionSort(ArrayWrapper wrapper) {
        int[] array = wrapper.getArray();
        if (array == null || array.length < 2){
            logger.info("Array is empty or has one element, sorting skipped");
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
        logger.info("Array successfully sorted using Insertion Sort");
        wrapper.setArray(array);
    }
}
