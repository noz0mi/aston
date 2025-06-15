package example.homework1.vehicles;

public class Taxi extends Vehicle implements Wheeled{
    private int maxPersonCount;

    public Taxi(int maxPersonCount) {
        this.maxPersonCount = maxPersonCount;
    }

    @Override
    public void move() {
        System.out.println("Taxi is taking a route");
    }
}
