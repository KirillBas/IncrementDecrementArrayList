package ru.basharin;

import java.util.Arrays;

public class IncrementDecrementArrayList {
    private final int defaultCapacity = 10;
    private int[] integerData;
    private int size;

    public IncrementDecrementArrayList() {
        this.integerData = new int[defaultCapacity];
    }

    public boolean add(int number) {
        updateSize(size + 1);
        for (int i = 0; i < integerData.length; i++) {
            integerData[i]+=number;
        }
        integerData[size++] = number;
        return true;
    }

    public boolean delete(int o) {
        for (int i = 0; i < integerData.length; i++) {
            if (o == integerData[i]) {
                for (int j = 0; j < integerData.length; j++) {
                    integerData[j]-= o;
                }
                remove(i);
            }
        }
        return false;
    }

    public int searchIndex(int index) {
        if (!checkSize(index)){
            return IncrementDecrementArrayList.this.integerData[index];
        }
        return -1;
    }

    public int searchValue(int o) {
        for (int i = 0; i < integerData.length; i++) {
            if (o == integerData[i]) {
                return integerData[i];
            }
        }
        return -1;
    }

    public int searchMax() {
        return Math.max(integerData[0], integerData[integerData.length-1]);
    }

    public int searchMin() {
        return Math.min(integerData[0], integerData[integerData.length-1]);
    }

    public int average() {
        int average= 0;
        for (int i = 0; i < integerData.length; i++) {
            average+=integerData[i];
        }
        return average/integerData.length;
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
        if (!checkSize(index)){
            int numMoved = size - index - 1;
            if (numMoved > 0)
                System.arraycopy(integerData, index+1, integerData, index, numMoved);
            integerData[--size] = 0;
        }
    }

    public int size() {
        return size;
    }

    private boolean checkSize(int index) {
        if (index>size || index<0) {
            System.out.println("Index not found");;
        }
        return true;
    }
}
