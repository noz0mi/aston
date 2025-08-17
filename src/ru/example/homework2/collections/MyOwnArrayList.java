package ru.example.homework2.collections;

import java.util.Arrays;

public class MyOwnArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private E[] elements;

    public MyOwnArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyOwnArrayList(int capacity) {
        this.elements = (E[]) new Object[capacity];
    }

    public boolean add(E element) {
        if (size == elements.length) {
            this.elements = grow(size + 1);
        }
        elements[size] = element;
        size++;
        return true;
    }

    private E[] grow(int requiredSize) {
        int oldSize = size;
        if(oldSize > 0) {
            int newSize = requiredSize + (requiredSize >> 1);
            return elements = Arrays.copyOf(elements, newSize);
        } else {
            return elements = (E[]) new Object[Math.max(DEFAULT_CAPACITY, requiredSize)];
        }
    }

    private boolean checkIndex(int index) {
        if (index >= size) {
            System.out.println("Индекс вышел за границы массива");
            return false;
        }
        return true;
    }

    public E get(int index) {
         if (checkIndex(index)) {
             return (E) elements[index];
         }
         return null;
    }

    public E remove(int index) {
        if (checkIndex(index)) {
            E[] changedArray = (E[]) new Object[size - 1];
            for (int i = 0; i < index; i++) {
                changedArray[i] = elements[i];
            }
            for (int i = index; i < size - 1 ; i++) {
                changedArray[i] = elements[i+1];
            }
            elements = changedArray;
            size--;
            return elements[index];
        } else {
            return null;
        }
    }

    public boolean addAll(E[] array) {
        return addAll(size, array);
    }

    public boolean addAll(int index, E[] array) {
        int addedLength = array.length;
        if (addedLength == 0)
            return false;
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("Index: "+ index +", Size: "+ size);
        if (addedLength > (this.elements.length - size)) {
            this.elements = grow(size + addedLength);
        }
        if (index > 0) {
            System.arraycopy(elements, index, elements, index + addedLength, size - index);
        }
        System.arraycopy(array, 0, this.elements, index, addedLength);
        size += addedLength;
        return true;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyOwnArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
