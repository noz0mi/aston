package example.homework4.deadlock;

public class DeadLockExample{

    private Object resource1;
    private Object resource2;

    public DeadLockExample() {
        resource1 = new Object();
        resource2 = new Object();
    }

    public void capture1() {
        synchronized (this.resource1) {
            System.out.println("Ресурс 1 захвачен потоком " + Thread.currentThread().getName());
            synchronized (this.resource2) {
                System.out.println("Захват ресурса 2");
            }
        }
    }
    public void capture2() {
        synchronized (this.resource2) {
            System.out.println("Ресурс 2 захвачен потоком " + Thread.currentThread().getName());
            synchronized (this.resource1) {
                System.out.println("Захват ресурса 1");
            }
        }
    }

}
