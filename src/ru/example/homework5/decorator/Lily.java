package ru.example.homework5.decorator;

public class Lily extends Flower{

    public Lily(int amount, int cost) {
        this.amount = amount;
        this.cost = cost;
        description = "Lily";
    }

    @Override
    public int cost() {
        return cost * amount;
    }
}
