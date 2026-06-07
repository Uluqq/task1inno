package by.papkovich.task1.repository;

import by.papkovich.task1.entity.ArrayWrapper;

import java.util.ArrayList;
import java.util.List;

public class ArrayWrapperRepository {
  private static ArrayWrapperRepository repositoryInstance;
  private final List<ArrayWrapper> arrayWrappers;

  private ArrayWrapperRepository() {
    arrayWrappers = new ArrayList<>();
  }

  public static ArrayWrapperRepository getRepositoryInstance() {
    if (repositoryInstance == null){
      repositoryInstance = new ArrayWrapperRepository();
    }
    return repositoryInstance;
  }

  public void addArrayWrapper(ArrayWrapper arrayWrapper){
    arrayWrappers.add(arrayWrapper);
  }
  public void removeArrayWrapper(ArrayWrapper arrayWrapper){
    arrayWrappers.remove(arrayWrapper);
  }
}
