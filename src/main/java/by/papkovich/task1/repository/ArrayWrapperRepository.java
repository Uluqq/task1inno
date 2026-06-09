package by.papkovich.task1.repository;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.specification.ArrayWrapperSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayWrapperRepository {
  private static final Logger logger = LogManager.getLogger(ArrayWrapperRepository.class);
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
    logger.info("Added ArrayWrapper to repository. Current size: {}", arrayWrappers.size());
  }

  public void removeArrayWrapper(ArrayWrapper arrayWrapper){
    arrayWrappers.remove(arrayWrapper);
    logger.info("Removed ArrayWrapper from repository. Current size: {}", arrayWrappers.size());
  }

  public List<ArrayWrapper> findBy(ArrayWrapperSpecification specification){
    logger.info("Starting repository search using specification: {}", specification.getClass().getSimpleName());
    List<ArrayWrapper> result = new ArrayList<>();
    for (ArrayWrapper arrayWrapper : arrayWrappers){
      if (specification.specifyArrayWrapper(arrayWrapper)){
        result.add(arrayWrapper);
      }
    }
    logger.info("Search completed. Found {} elements.", result.size());
    return result;
  }

  public void sortBy(Comparator<ArrayWrapper> comparator){
    logger.info("Sorting repository using comparator: {}", comparator.getClass().getSimpleName());
    arrayWrappers.sort(comparator);
  }
}