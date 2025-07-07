package example.homework4;

public class Main {

    public static volatile boolean flag = true;

    public static void main(String[] args) {
        Runnable task1 = () -> {
            synchronized (Main.class) {
                while (flag) {
                    System.out.println("1");
                    flag = false;
                }
            }
        };
        Runnable task2 = () -> {
            synchronized (Main.class) {
                while (!(flag)) {
                    System.out.println("2");
                    flag = true;
                }
            }
        };
        Thread thread1 = new Thread(task1, "Thread 1");
        Thread thread2 = new Thread(task2, "Thread 2");
        thread1.start();
        thread2.start();
        while (true) {
            thread1.run();
            thread2.run();
        }
    }
}
