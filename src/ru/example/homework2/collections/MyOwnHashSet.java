package ru.example.homework2.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyOwnHashSet<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 0.75d;

    private int capacity;
    private double loadFactor;
    private List<T>[] buckets;
    private int size;

    public MyOwnHashSet() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public MyOwnHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.buckets = new List[this.capacity];
    }

    private int hash(T element) {
        if (element == null){
            return 0;
        }
        return Math.abs(element.hashCode()) % capacity;
    }

    public boolean contains(T element) {
        int index = hash(element);
        if(buckets[index] == null) {
            return false;
        }
        return buckets[index].contains(element);
    }

    public boolean add(T element) {
        if (contains(element)) {
            return false;
        }
        if (size >= capacity * loadFactor){
            resize();
        }
        int index = hash(element);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        buckets[index].add(element);
        size++;
        return true;
    }

    private void resize() {
        capacity *= 2;
        LinkedList<T>[] resizedBuckets = new LinkedList[capacity];
        for (List<T> bucket : buckets) {
            if (bucket != null) {
                for (int i = 0; i < bucket.size(); i ++) {
                    T element = bucket.get(i);
                    int newIndex = hash(element);
                    if (resizedBuckets[newIndex] == null) {
                        resizedBuckets[newIndex] = new LinkedList<>();
                    }
                    resizedBuckets[newIndex].add(element);
                }
            }
        }
        this.buckets = resizedBuckets;
    }

    public boolean remove(T element) {
        if (!(contains(element))) {
            return false;
        }
        int index = hash(element);
        List<T> bucket = buckets[index];
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).equals(element)) {
                bucket.remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyOwnHashSet{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
