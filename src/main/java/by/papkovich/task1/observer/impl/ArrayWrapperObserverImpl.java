package by.papkovich.task1.observer.impl;

import by.papkovich.task1.entity.ArrayStatistics;
import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.observer.ArrayWrapperObserver;
import by.papkovich.task1.service.impl.ArrayWrapperServiceCalculatorImpl;
import by.papkovich.task1.warehouse.ArrayWrapperWarehouse;

public class ArrayWrapperObserverImpl implements ArrayWrapperObserver {
  private ArrayWrapperServiceCalculatorImpl calculatorService;

  public ArrayWrapperObserverImpl(ArrayWrapperServiceCalculatorImpl calculatorService){
    this.calculatorService = calculatorService;
  }

  @Override
  public void updateArrayWrapper(ArrayWrapper wrapper) {
    if (wrapper.getArray() == null || wrapper.getArray().length == 0) {
      return;
    }
    ArrayStatistics statistics = new ArrayStatistics(
            calculatorService.getMin(wrapper).getAsInt(),
            calculatorService.getMax(wrapper).getAsInt(),
            calculatorService.getSum(wrapper).getAsInt(),
            calculatorService.getAverage(wrapper).getAsDouble()
            );
    ArrayWrapperWarehouse warehouse = ArrayWrapperWarehouse.getWarehouseInstance();
    warehouse.putValues(wrapper.getId(), statistics);
  }
}
