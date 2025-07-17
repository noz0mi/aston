package ru.example.homework5.decorator;

public class Ribbons extends FlowerDecorator {

    public Ribbons(Flower flower, int cost) {
        this.flower = flower;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return flower.getDescription() + ", Ribbons";
    }

    @Override
    public int cost() {
        return flower.cost() + cost;
    }
}
