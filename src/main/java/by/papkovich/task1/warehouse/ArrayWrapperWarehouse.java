package by.papkovich.task1.warehouse;

import by.papkovich.task1.entity.ArrayStatistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class ArrayWrapperWarehouse {
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
  }
  public Optional<ArrayStatistics> getValues(UUID id){
    return Optional.ofNullable(arrayWrapperStatistics.get(id));
  }
}
