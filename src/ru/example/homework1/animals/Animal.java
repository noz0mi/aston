package ru.example.homework1.animals;

public abstract class Animal {
    private String species;

    protected Animal() {
    }

    protected Animal(String species) {
        this.species = species;
    }

    public void breed(){
        System.out.println("It's breeding");
    }

    public void eat() {
        System.out.println("It's eating");
    }

    public abstract void speak();
}
