package ru.example2.homework1;


import java.util.Arrays;

public class MyOwnHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 0.75d;

    private int size;
    private Node<K, V>[] table;

    public MyOwnHashMap() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    private class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;

        Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private int hash(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode()) % table.length;
    }

    public void put(K key, V value) {
        if (size >= table.length * DEFAULT_LOAD_FACTOR) {
            resize();
        }
        int index = hash(key);
        Node<K, V> node = table[index];
        while (node != null) {
            if (key != null && key.equals(node.key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        table[index] = new Node<>(key, value, table[index]);
        size++;
    }

    private void resize() {
        Node<K, V>[] oldTable = table;
        int newCapacity = table.length * 2;
        table = new Node[newCapacity];
        for (Node<K, V> node : oldTable) {
            while (node != null) {
                Node<K, V> nextNode = node.next;
                int newIndex = hash(node.key);
                node.next = table[newIndex];
                table[newIndex] = node;
                node = nextNode;
            }
        }
    }

    public V remove(K key) {
        int index = hash(key);
        Node<K, V> prev = null;
        Node<K, V> node = table[index];
        while (node != null) {
            if (key != null && key.equals(node.key)) {
                if (prev == null) {
                    table[index] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return node.value;
            }
            prev = node;
            node = node.next;
        }
        return null;
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> node = table[index];
        while (node != null) {
            if (key != null && key.equals(node.key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyOwnHashMap{");
        sb.append("table=").append(Arrays.toString(table));
        sb.append('}');
        return sb.toString();
    }
}
