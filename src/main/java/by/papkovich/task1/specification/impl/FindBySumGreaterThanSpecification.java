package by.papkovich.task1.specification.impl;

import by.papkovich.task1.entity.ArrayStatistics;
import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.specification.ArrayWrapperSpecification;
import by.papkovich.task1.warehouse.ArrayWrapperWarehouse;

import java.util.Optional;
import java.util.UUID;

public class FindBySumGreaterThanSpecification implements ArrayWrapperSpecification {

  private final int targetSum;
  private final ArrayWrapperWarehouse warehouse = ArrayWrapperWarehouse.getWarehouseInstance();
  public FindBySumGreaterThanSpecification(int targetSum){
    this.targetSum = targetSum;
  }

  @Override
  public boolean specifyArrayWrapper(ArrayWrapper wrapper) {
    UUID wrapperId = wrapper.getId();
    int currentSum = warehouse.getValues(wrapperId)
            .map(arrayStatistics -> arrayStatistics.sum())
            .orElse(0);
    return currentSum > targetSum;
  }
}