package by.papkovich.task1.specification.impl;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.specification.ArrayWrapperSpecification;


public class FindByLengthSpecification implements ArrayWrapperSpecification {

  private final int length;

  public FindByLengthSpecification(int length){
    this.length = length;
  }

  @Override
  public boolean specifyArrayWrapper(ArrayWrapper wrapper) {
    int wrapperLength = wrapper.getLength();
    return wrapperLength == length;
  }
}