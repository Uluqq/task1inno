package by.papkovich.task1.comporator;

import by.papkovich.task1.entity.ArrayWrapper;

import java.util.Comparator;

public class ArrayWrapperIdComparator implements Comparator<ArrayWrapper> {
  @Override
  public int compare(ArrayWrapper firstWrapper, ArrayWrapper secondWrapper) {
    return firstWrapper.getId().compareTo(secondWrapper.getId());
  }
}
