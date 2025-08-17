package ru.example.homework4;

public class Task implements Runnable {

    private boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
            System.out.println("Работает поток " + Thread.currentThread().getName());

                if (flag) {
                    System.out.println("1");
                    flag = false;
                } else {
                    System.out.println("2");
                    flag = true;
                }
            }
        }
    }
}
