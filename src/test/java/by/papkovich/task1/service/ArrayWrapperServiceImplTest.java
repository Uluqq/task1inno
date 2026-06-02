package by.papkovich.task1.service;

import by.papkovich.task1.service.impl.ArrayWrapperServiceCalculatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import by.papkovich.task1.entity.ArrayWrapper;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayWrapperServiceImplTest {

    private ArrayWrapperCalculatorService service;
    @BeforeEach
    public void setUp() {
        service = new ArrayWrapperServiceCalculatorImpl();
    }
    @Test
    public void getMinShouldReturnCorrectValue() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[]{5, -2, 9, 0, -2});
        OptionalInt result = service.getMin(wrapper);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(-2, result.getAsInt());
    }
    @Test
    public void getMinShouldReturnEmptyForEmptyArray() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[0]);
        OptionalInt result = service.getMin(wrapper);
        Assertions.assertFalse(result.isPresent());
    }
    @Test
    public void getMaxShouldReturnCorrectValue() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[]{5, -2, 9, 0, 9});
        OptionalInt result = service.getMax(wrapper);
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(9, result.getAsInt());
    }
    @Test
    public void getSumShouldReturnCorrectSum() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[]{5, -2, 9});
        OptionalInt result = service.getSum(wrapper);
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(12, result.getAsInt());
    }
    @Test
    public void getAverageShouldReturnCorrectAverage() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[]{5, 2, 9, -1});
        OptionalDouble result = service.getAverage(wrapper);
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(3.75, result.getAsDouble());
    }
}