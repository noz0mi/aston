package ru.example.homework1.animals;

public abstract class Mammal extends Animal {

    private Spine spine;

    protected Mammal(Spine spine) {
        super();
        this.spine = spine;
    }

    public abstract void breastfeed();
}
