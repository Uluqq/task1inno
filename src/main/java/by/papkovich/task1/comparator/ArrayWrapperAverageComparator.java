package by.papkovich.task1.comparator;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.warehouse.ArrayWrapperWarehouse;

import java.util.Comparator;
import java.util.UUID;

public class ArrayWrapperAverageComparator implements Comparator<ArrayWrapper> {
  private final ArrayWrapperWarehouse warehouse = ArrayWrapperWarehouse.getWarehouseInstance();

  @Override
  public int compare(ArrayWrapper firstWrapper, ArrayWrapper secondWrapper) {

    UUID firstWrapperId = firstWrapper.getId();
    double firstAverage = warehouse.getValues(firstWrapperId)
            .map(arrayStatistics -> arrayStatistics.average())
            .orElse(0.0);

    UUID secondWrapperId = secondWrapper.getId();
    double secondAverage = warehouse.getValues(secondWrapperId)
            .map(arrayStatistics -> arrayStatistics.average())
            .orElse(0.0);

    return Double.compare(firstAverage, secondAverage);
  }
}
