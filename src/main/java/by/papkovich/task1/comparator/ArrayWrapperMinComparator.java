package by.papkovich.task1.comparator;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.warehouse.ArrayWrapperWarehouse;

import java.util.Comparator;
import java.util.UUID;

public class ArrayWrapperMinComparator implements Comparator<ArrayWrapper> {
  private final ArrayWrapperWarehouse warehouse = ArrayWrapperWarehouse.getWarehouseInstance();

  @Override
  public int compare(ArrayWrapper firstWrapper, ArrayWrapper secondWrapper) {

    UUID firstWrapperId = firstWrapper.getId();
    int firstMin = warehouse.getValues(firstWrapperId)
            .map(arrayStatistics -> arrayStatistics.min())
            .orElse(0);

    UUID secondWrapperId = secondWrapper.getId();
    int secondMin = warehouse.getValues(secondWrapperId)
            .map(arrayStatistics -> arrayStatistics.min())
            .orElse(0);

    return Integer.compare(firstMin, secondMin);
  }
}
