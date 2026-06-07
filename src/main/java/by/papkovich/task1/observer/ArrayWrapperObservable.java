package by.papkovich.task1.observer;

public interface ArrayWrapperObservable {
  void attach(ArrayWrapperObserver observer);
  void detach(ArrayWrapperObserver observer);
  void notifyObservers();
}
