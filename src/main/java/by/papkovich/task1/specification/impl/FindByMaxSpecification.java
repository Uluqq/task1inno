package by.papkovich.task1.specification.impl;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.specification.ArrayWrapperSpecification;
import by.papkovich.task1.warehouse.ArrayWrapperWarehouse;

import java.util.UUID;

public class FindByMaxSpecification implements ArrayWrapperSpecification {

  private final int targetMax;
  private final ArrayWrapperWarehouse warehouse = ArrayWrapperWarehouse.getWarehouseInstance();
  public FindByMaxSpecification(int targetMax){
    this.targetMax = targetMax;
  }

  @Override
  public boolean specifyArrayWrapper(ArrayWrapper wrapper) {
    UUID wrapperId = wrapper.getId();
    int currentMax = warehouse.getValues(wrapperId)
            .map(arrayStatistics -> arrayStatistics.max())
            .orElse(0);
    return currentMax == targetMax;
  }
}