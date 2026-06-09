package by.papkovich.task1.comporator;

import by.papkovich.task1.entity.ArrayWrapper;

import java.util.Comparator;

public class ArrayWrapperLengthComparator implements Comparator<ArrayWrapper> {
  @Override
  public int compare(ArrayWrapper firstWrapper, ArrayWrapper secondWrapper) {
    return Integer.compare(firstWrapper.getLength(), secondWrapper.getLength());
  }
}
