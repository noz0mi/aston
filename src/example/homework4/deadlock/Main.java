package example.homework4.deadlock;

public class Main {
    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();
        Runnable task1 = deadLockExample::capture1;
        Runnable task2 = deadLockExample::capture2;
        new Thread(task1, "T1").start();
        new Thread(task2, "T2").start();
    }
}
