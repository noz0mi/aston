package example.homework4.livelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLockExample {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public LiveLockExample() {
    }

    public void someMethod() {
        while (true) {
            lock1.lock();
            System.out.println("Блокировка 1 захвачена потоком " + Thread.currentThread().getName());
            System.out.println("Попытка захвата блокировки 2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lock2.tryLock()) {
                System.out.println(Thread.currentThread().getName() + " захватил блокировку 2");
            } else {
                System.out.println("Не получилось захватить  блокировку 2. Блокировка 1 будет снята");
                lock1.unlock();
                continue;
            }
            System.out.println("Метод 1 завершён");
            break;
        }
        lock2.unlock();
        lock1.unlock();
    }

    public void anotherMethod() {
        while (true) {
            lock2.lock();
            System.out.println("Блокировка 2 захвачена потоком " + Thread.currentThread().getName());
            System.out.println("Попытка захвата блокировки 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lock1.tryLock()) {
                System.out.println(Thread.currentThread().getName() + " захватил блокировку 1");
            } else {
                System.out.println("Не получилось захватить  блокировку 1. Блокировка 2 будет снята");
                lock2.unlock();
                continue;
            }
            System.out.println("Метод 2 завершён");
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }

}
