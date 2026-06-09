package by.papkovich.task1.specification.impl;

import by.papkovich.task1.entity.ArrayWrapper;
import by.papkovich.task1.specification.ArrayWrapperSpecification;

import java.util.UUID;

public class FindByIdSpecification implements ArrayWrapperSpecification {

  private final UUID targetId;

  public FindByIdSpecification(UUID targetId){
    this.targetId = targetId;
  }

  @Override
  public boolean specifyArrayWrapper(ArrayWrapper wrapper) {
    UUID wrapperId = wrapper.getId();
    return wrapperId.equals(targetId);
  }
}