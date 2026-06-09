package by.papkovich.task1.warehouse;

import by.papkovich.task1.entity.ArrayStatistics;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class ArrayWrapperWarehouse {
  private static final Logger logger = LogManager.getLogger(ArrayWrapperWarehouse.class);
  private static ArrayWrapperWarehouse warehouseInstance;
  private final Map<UUID, ArrayStatistics> arrayWrapperStatistics;

  private ArrayWrapperWarehouse() {
    arrayWrapperStatistics = new HashMap<>();
  }

  public static ArrayWrapperWarehouse getWarehouseInstance(){
    if (warehouseInstance == null){
      warehouseInstance = new ArrayWrapperWarehouse();
    }
    return warehouseInstance;
  }

  public void putValues(UUID id, ArrayStatistics stats){
    arrayWrapperStatistics.put(id, stats);
    logger.info("Statistics updated in warehouse for ArrayWrapper ID: {}", id);
  }
  public Optional<ArrayStatistics> getValues(UUID id){
    return Optional.ofNullable(arrayWrapperStatistics.get(id));
  }
}
