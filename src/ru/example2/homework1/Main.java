package ru.example2.homework1;

public class Main {
    public static void main(String[] args) {
        MyOwnHashMap<Integer, String> myOwnHashMap = new MyOwnHashMap<>();
        myOwnHashMap.put(1,"string");
        myOwnHashMap.put(2,"string2");
        myOwnHashMap.put(3,"string3");
        System.out.println(myOwnHashMap);
        System.out.println(myOwnHashMap.get(2));
        myOwnHashMap.remove(2);
        System.out.println(myOwnHashMap.get(2));
    }
}
