package ru.example.homework4.livelock;

import java.util.concurrent.locks.Lock;

public class LiveLockExample {


    public LiveLockExample() {
    }

    public void someMethod(Lock lock1, Lock lock2) {
        try {
            while (true) {
                lock1.lock();
                System.out.println("Блокировка 1 захвачена потоком " + Thread.currentThread().getName());
                System.out.println("Попытка захвата блокировки 2");
                Thread.sleep(100);
                if (lock2.tryLock()) {
                    System.out.println(Thread.currentThread().getName() + " захватил блокировку 2");
                } else {
                    System.out.println("Не получилось захватить  блокировку 2. Блокировка 1 будет снята");
                    lock1.unlock();
                    continue;
                }
            }
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Разблокировка");
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
