package ru.example.homework4.livelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        LiveLockExample liveLockExample = new LiveLockExample();
        Lock lock1 = new ReentrantLock(true);
        Lock lock2 = new ReentrantLock(true);
        Runnable task1 = () -> {
            liveLockExample.someMethod(lock1, lock2);
        };
        Runnable task2 = () -> {
            liveLockExample.someMethod(lock2, lock1);
        };
        new Thread(task1, "T1").start();
        new Thread(task2, "T2").start();
    }
}
