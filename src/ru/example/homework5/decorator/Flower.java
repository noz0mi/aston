package ru.example.homework5.decorator;

public abstract class Flower {

    protected String description;
    protected int amount;
    protected int cost;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
