package example.homework1.vehicles;

public class Helicopter extends Vehicle implements Screw, Hauling, Wheeled{

    private int liftingCapacity;

    public Helicopter(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }


    @Override
    public void haul() {
        System.out.println("Helicopter is hauling");
    }

    @Override
    public void move() {
        System.out.println("Helicopter is flying in the sky");
    }
}
