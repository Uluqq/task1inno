package by.papkovich.task1.entity;

import by.papkovich.task1.observer.ArrayWrapperObservable;
import by.papkovich.task1.observer.ArrayWrapperObserver;

import java.util.*;

public class    ArrayWrapper implements ArrayWrapperObservable {
    private int[] array;
    private UUID id;
    private List<ArrayWrapperObserver> observers = new ArrayList<>();

    public ArrayWrapper(int[] array){
        this.id = UUID.randomUUID();
        if (array != null){
            this.array = Arrays.copyOf(array, array.length);
        } else {
            this.array = null;
        }
    }
    public int getLength() {
        if (array == null) {
            return 0;
        }
        return array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        ArrayWrapper that = (ArrayWrapper) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ArrayWrapper{");
        sb.append("array=");
        if (array == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < array.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(array[i]);
            sb.append(']');
        }
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    public void setArray(int[] array) {
        if (array != null) {
            this.array = Arrays.copyOf(array, array.length);
        } else {
            this.array = null;
        }
        notifyObservers();
    }
    public int[] getArray() {
        if (array != null){
            return Arrays.copyOf(array, array.length);
        } else {
            return null;
        }
    }

    public UUID getId() {
        return id;
    }

    @Override
    public void attach(ArrayWrapperObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(ArrayWrapperObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ArrayWrapperObserver observer : observers){
            observer.updateArrayWrapper(this);
        }
    }
}
