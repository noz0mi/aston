package example.homework1.vehicles;

public class Motorboat extends Vehicle implements Screw, Hauling{

    private int motorboatSpeed;

    public Motorboat(int motorboatSpeed) {
        this.motorboatSpeed = motorboatSpeed;
    }


    @Override
    public void haul() {
        System.out.println("Motorboat is hauling");
    }

    @Override
    public void move() {
        System.out.println("Motorboat is floating on the sea");
    }
}
