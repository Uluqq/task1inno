package by.papkovich.task1.specification.impl;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.specification.ArrayWrapperSpecification;
import by.papkovich.task1.warehouse.ArrayWrapperWarehouse;

import java.util.UUID;

public class FindByAverageSpecification implements ArrayWrapperSpecification {

  private final double targetAverage;
  private final ArrayWrapperWarehouse warehouse = ArrayWrapperWarehouse.getWarehouseInstance();
  public FindByAverageSpecification(double targetAverage){
    this.targetAverage = targetAverage;
  }

  @Override
  public boolean specifyArrayWrapper(ArrayWrapper wrapper) {
    UUID wrapperId = wrapper.getId();
    Double currentSum = warehouse.getValues(wrapperId)
            .map(arrayStatistics -> arrayStatistics.average())
            .orElse(0.0);
    return currentSum == targetAverage;
  }
}