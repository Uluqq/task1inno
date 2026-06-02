package by.papkovich.task1.entity;

import java.util.Arrays;

public class ArrayWrapper {
    private int[] array;

    public ArrayWrapper(int[] array){
        if (array != null){
            this.array = Arrays.copyOf(array, array.length);
        } else {
            this.array = null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayWrapper that = (ArrayWrapper) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "ArrayWrapper{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
    public void setArray(int[] array) {
        if (array != null) {
            this.array = Arrays.copyOf(array, array.length);
        } else {
            this.array = null;
        }
    }
    public int[] getArray() {
        if (array != null){
            return Arrays.copyOf(array, array.length);
        } else {
            return null;
        }
    }
}
