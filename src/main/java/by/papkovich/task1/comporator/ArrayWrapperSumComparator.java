package by.papkovich.task1.comporator;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.warehouse.ArrayWrapperWarehouse;

import java.util.Comparator;
import java.util.UUID;

public class ArrayWrapperSumComparator implements Comparator<ArrayWrapper> {
  private final ArrayWrapperWarehouse warehouse = ArrayWrapperWarehouse.getWarehouseInstance();

  @Override
  public int compare(ArrayWrapper firstWrapper, ArrayWrapper secondWrapper) {

    UUID firstWrapperId = firstWrapper.getId();
    int firstSum = warehouse.getValues(firstWrapperId)
            .map(arrayStatistics -> arrayStatistics.sum())
            .orElse(0);

    UUID secondWrapperId = secondWrapper.getId();
    int secondSum = warehouse.getValues(secondWrapperId)
            .map(arrayStatistics -> arrayStatistics.sum())
            .orElse(0);
    return Integer.compare(firstSum, secondSum);
  }
}
