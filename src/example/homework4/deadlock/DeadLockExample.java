package example.homework4.deadlock;

public class DeadLockExample{


    public DeadLockExample() {
    }

    public void capture1(Object resource1, Object resource2) {
        synchronized (resource1) {
            System.out.println("Ресурс 1 захвачен потоком " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (resource2) {
                System.out.println("Захват ресурса 2 потоком " + Thread.currentThread().getName());
            }
        }
    }

}
