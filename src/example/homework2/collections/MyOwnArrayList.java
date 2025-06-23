package example.homework2.collections;


import java.util.Arrays;

public class MyOwnArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private Object[] innerArray;

    public MyOwnArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyOwnArrayList(int capacity) {
        this.innerArray = new Object[capacity];
    }

    public boolean add(T element) {
        if (size == innerArray.length) {
            this.innerArray = grow(size + 1);
        }
        innerArray[size] = element;
        size++;
        return true;
    }

    private Object[] grow(int requiredSize) {
        int oldSize = size;
        if(oldSize > 0) {
            int newSize = requiredSize + (requiredSize >> 1);
            return innerArray = Arrays.copyOf(innerArray, newSize);
        } else {
            return innerArray = new Object[Math.max(DEFAULT_CAPACITY, requiredSize)];
        }
    }

    private boolean checkIndex(int index) {
        if (index >= size) {
            System.out.println("Индекс вышел за границы массива");
            return false;
        }
        return true;
    }

    public T get(int index) {
         if (checkIndex(index)) {
             return (T) innerArray[index];
         }
         return null;
    }

    public T remove(int index) {
        if (checkIndex(index)) {
            Object[] changedArray = new Object[size - 1];
            for (int i = 0; i < index; i++) {
                changedArray[i] = innerArray[i];
            }
            for (int i = index; i < size - 1 ; i++) {
                changedArray[i] = innerArray[i+1];
            }
            innerArray = changedArray;
            size--;
            return (T) innerArray[index];
        } else {
            return null;
        }
    }

    public boolean addAll(T[] array) {
        return addAll(size, array);
    }

    public boolean addAll(int index, T[] array) {
        int addedLength = array.length;
        if (addedLength == 0)
            return false;
        if (addedLength > (this.innerArray.length - size)) {
            this.innerArray = grow(size + addedLength);
        }
        Object[] newArray = new Object[innerArray.length];
        //Копирование элементов до индекса вставки
        for (int i = 0; i < index; i++) {
            newArray[i] = innerArray[i];
        }
        //Вставка добавляемого массива
        for (int i = 0; i < array.length; i++) {
            newArray[i + index] = array[i];
        }
        //Копирование оставшихся элементов после вставки добавляемого массива
        for (int i = index; i < size; i++) {
            newArray[i + array.length] = innerArray[i];
        }
        this.innerArray = newArray;
        size += array.length;
        return true;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyOwnArrayList{" +
                "innerArray=" + Arrays.toString(innerArray) +
                '}';
    }
}
