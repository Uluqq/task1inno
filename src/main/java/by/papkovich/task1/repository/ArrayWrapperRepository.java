package by.papkovich.task1.repository;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.specification.ArrayWrapperSpecification;

import java.util.ArrayList;
import java.util.Comparator;
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
  public List<ArrayWrapper> findBy(ArrayWrapperSpecification specification){
    List<ArrayWrapper> result = new ArrayList<>();
    for (ArrayWrapper arrayWrapper : arrayWrappers){
      if (specification.specifyArrayWrapper(arrayWrapper)){
        result.add(arrayWrapper);
      }
    }
    return result;
  }
  public void sortBy(Comparator<ArrayWrapper> comparator){
    arrayWrappers.sort(comparator);
  }
}
