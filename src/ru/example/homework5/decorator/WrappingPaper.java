package ru.example.homework5.decorator;

public class WrappingPaper extends FlowerDecorator {

    public WrappingPaper(Flower flower, int cost) {
        this.flower = flower;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return flower.getDescription() + ", Wrapping paper";
    }

    @Override
    public int cost() {
        return flower.cost() + cost;
    }
}
