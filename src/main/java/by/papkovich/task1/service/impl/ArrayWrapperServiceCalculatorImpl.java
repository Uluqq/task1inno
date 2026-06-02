package by.papkovich.task1.service.impl;

import by.papkovich.task1.service.ArrayWrapperCalculatorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.papkovich.task1.entity.ArrayWrapper;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayWrapperServiceCalculatorImpl implements ArrayWrapperCalculatorService {

    private static final Logger logger = LogManager.getLogger(ArrayWrapperServiceCalculatorImpl.class);

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
}
