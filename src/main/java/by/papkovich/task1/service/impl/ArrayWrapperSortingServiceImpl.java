package by.papkovich.task1.service.impl;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.service.ArrayWrapperSortingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayWrapperSortingServiceImpl implements ArrayWrapperSortingService {

  private static final Logger logger = LogManager.getLogger(ArrayWrapperServiceCalculatorImpl.class);

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
