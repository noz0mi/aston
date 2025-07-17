package ru.example.homework5.decorator;

public abstract class FlowerDecorator extends Flower {

    Flower flower;
    int cost;

    public abstract String getDescription();
}
