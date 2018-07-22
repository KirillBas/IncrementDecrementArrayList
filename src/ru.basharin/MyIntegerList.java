package ru.basharin;

import java.io.Serializable;
import java.util.Arrays;

public class MyIntegerList implements Cloneable, Serializable {
    private final int defaultCapacity = 10;
    private int[] integerData = new int[defaultCapacity];
    private int size;

    public MyIntegerList() {
        this.integerData = integerData;
    }

    public boolean add(int number) {
        updateSize(size + 1);
        integerData[size++] = number;
        return true;
    }

    public boolean delete(Object o) {
        for (int i = 0; i < integerData.length; i++) {
            if (o.equals(integerData[i])) {
                remove(i);
            }
        }
        return true;
    }

    public int searchIndex(int index) {
        return 1;
    }

    public int searchValue(int value) {
        return 1;
    }

    public int searchMax() {
        return 1;
    }

    public int searchMin() {
        return 1;
    }

    public int average() {
        return 1;
    }

    private void updateSize(int minCapacity) {
        if (minCapacity - integerData.length > 0) {
            int oldCapacity = integerData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity - oldCapacity < 0) {
                newCapacity = minCapacity;
            }
            integerData = Arrays.copyOf(integerData, newCapacity);
        }
    }

    private void remove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(integerData, index+1, integerData, index, numMoved);
        integerData[--size] = 0;
    }

    public int size() {
        return size;
    }
}
