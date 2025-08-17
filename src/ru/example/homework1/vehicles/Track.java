package ru.example.homework1.vehicles;

public class Track extends Vehicle implements Wheeled, Hauling{

    private int liftingCapacity;

    public Track(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void haul() {
        System.out.println("Track is hauling");
    }

    @Override
    public void move() {
        System.out.println("Track is driving down the highway");
    }
}
