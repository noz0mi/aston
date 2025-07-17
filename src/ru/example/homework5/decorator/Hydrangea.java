package ru.example.homework5.decorator;

public class Hydrangea extends Flower{

    public Hydrangea(int amount, int cost) {
        this.amount = amount;
        this.cost = cost;
        description = "Hydrangea";
    }

    @Override
    public int cost() {
        return cost * amount;
    }
}
