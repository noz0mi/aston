package ru.example.homework4.deadlock;

public class Main {
    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();
        Object resource1 = new Object();
        Object resource2 = new Object();
        Runnable task1 = () -> {
            deadLockExample.capture1(resource1, resource2);
        };
        Runnable task2 = () -> {
            deadLockExample.capture1(resource2, resource1);
        };
        new Thread(task1, "T1").start();
        new Thread(task2, "T2").start();
    }
}
