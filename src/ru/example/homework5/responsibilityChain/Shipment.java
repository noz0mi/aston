package ru.example.homework5.responsibilityChain;

public class Shipment {

    private int length;
    private int width;
    private int height;
    private int weight;
    private boolean fragile;
    private State state;

    public Shipment() {
        this.height = (int) Math.random()*100;
        this.length = (int) Math.random()*100;
        this.width = (int) Math.random()*100;
        this.weight = (int) Math.random()*100;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
