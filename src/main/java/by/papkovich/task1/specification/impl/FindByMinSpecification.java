package by.papkovich.task1.specification.impl;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.specification.ArrayWrapperSpecification;
import by.papkovich.task1.warehouse.ArrayWrapperWarehouse;

import java.util.UUID;

public class FindByMinSpecification implements ArrayWrapperSpecification {

  private final int targetMin;
  private final ArrayWrapperWarehouse warehouse = ArrayWrapperWarehouse.getWarehouseInstance();
  public FindByMinSpecification(int targetMin){
    this.targetMin = targetMin;
  }

  @Override
  public boolean specifyArrayWrapper(ArrayWrapper wrapper) {
    UUID wrapperId = wrapper.getId();
    int currentSum = warehouse.getValues(wrapperId)
            .map(arrayStatistics -> arrayStatistics.min())
            .orElse(0);
    return currentSum == targetMin;
  }
}