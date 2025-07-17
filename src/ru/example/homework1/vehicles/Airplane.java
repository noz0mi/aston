package ru.example.homework1.vehicles;

public class Airplane extends Vehicle implements Hauling, Winged, Wheeled, Screw{

    private String model;

    @Override
    public void haul() {
        System.out.println("Plane is hauling");
    }

    @Override
    public void move() {
        System.out.println("Plane is flying in the sky");
    }
}
