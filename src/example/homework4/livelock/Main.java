package example.homework4.livelock;

public class Main {

    public static void main(String[] args) {
        LiveLockExample liveLockExample = new LiveLockExample();
        Runnable task1 = liveLockExample::someMethod;
        Runnable task2 = liveLockExample::anotherMethod;
        new Thread(task1, "T1").start();
        new Thread(task2, "T2").start();
    }
}
