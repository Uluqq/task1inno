package by.papkovich.task1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import by.papkovich.task1.entity.ArrayWrapper;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayWrapperServiceImplTest {

    private ArrayWrapperService service;
    @BeforeEach
    public void setUp() {
        service = new ArrayWrapperServiceImpl();
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
    @Test
    public void bubbleSortShouldSortArrayCorrectly() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[]{5, -2, 9, 0, 4});
        service.bubbleSort(wrapper);
        int[] expected = {-2, 0, 4, 5, 9};
        Assertions.assertArrayEquals(expected, wrapper.getArray());
    }
    @Test
    public void bubbleSortShouldHandleAlreadySortedArray() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[]{1, 2, 3, 4});
        service.bubbleSort(wrapper);
        int[] expected = {1, 2, 3, 4};
        Assertions.assertArrayEquals(expected, wrapper.getArray());
    }
    @Test
    public void insertionSortShouldSortArrayCorrectly() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[]{5, -2, 9, 0, 4});
        service.insertionSort(wrapper);
        int[] expected = {-2, 0, 4, 5, 9};
        Assertions.assertArrayEquals(expected, wrapper.getArray());
    }
    @Test
    public void insertionSortShouldHandleEmptyArray() {
        ArrayWrapper wrapper = new ArrayWrapper(new int[0]);
        service.insertionSort(wrapper);
        Assertions.assertArrayEquals(new int[0], wrapper.getArray());
    }
}