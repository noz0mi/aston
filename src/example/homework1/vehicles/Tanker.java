package example.homework1.vehicles;

public class Tanker extends Vehicle implements Hauling, Screw{

    private int liftingCapacity;

    public Tanker(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void haul() {
        System.out.println("Tanker can haul");
    }

    @Override
    public void move() {
        System.out.println("Tanker is crossing the sea");
    }
}
