package net.algolist.datastructures;

import java.util.Arrays;

public class DynamicArray {

    private int[] storage;
    private int size;

    public DynamicArray() {
        storage = new int[10];
        size = 0;
    }

    public DynamicArray(int capacity) {
        storage = new int[capacity];
        size = 0;
    }

    public void ensureCapacity(int minimumCapacity) {
        int capacity = storage.length;
        if(minimumCapacity > capacity) {
            int newCapacity = (capacity * 3) / 2 + 1;
            if (newCapacity < minimumCapacity)
                newCapacity = minimumCapacity;
            storage = Arrays.copyOf(storage, newCapacity);
        }
    }

    private void pack() {
        int capacity = storage.length;
        if (size <= capacity / 2) {
            int newCapacity = (size * 3) / 2 + 1;
            storage = Arrays.copyOf(storage, newCapacity);
        }
    }

    public void trim() {
        int newCapacity = size;
        storage = Arrays.copyOf(storage, newCapacity);
    }

    public static void main(String[] args) {

    }

}
