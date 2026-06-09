package by.papkovich.task1.observer.impl;

import by.papkovich.task1.entity.ArrayStatistics;
import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.factory.impl.ArrayWrapperFactoryImpl;
import by.papkovich.task1.observer.ArrayWrapperObserver;
import by.papkovich.task1.service.impl.ArrayWrapperServiceCalculatorImpl;
import by.papkovich.task1.warehouse.ArrayWrapperWarehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayWrapperObserverImpl implements ArrayWrapperObserver {

  private static final Logger logger = LogManager.getLogger(ArrayWrapperObserverImpl.class);
  private ArrayWrapperServiceCalculatorImpl calculatorService;

  public ArrayWrapperObserverImpl(ArrayWrapperServiceCalculatorImpl calculatorService){
    this.calculatorService = calculatorService;
  }

  @Override
  public void updateArrayWrapper(ArrayWrapper wrapper) {
    logger.info("Observer triggered for ArrayWrapper ID: {}", wrapper.getId());
    if (wrapper.getArray() == null || wrapper.getArray().length == 0) {
      logger.warn("Array is empty or null. Statistics calculation skipped for ID: {}", wrapper.getId());
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
    logger.info("Successfully updated and stored statistics in warehouse for ID: {}", wrapper.getId());
  }
}
