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
        final StringBuffer sb = new StringBuffer("ArrayWrapper{");
        sb.append("array=");
        if (array == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < array.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(array[i]);
            sb.append(']');
        }
        sb.append('}');
        return sb.toString();
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
