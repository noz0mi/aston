package ru.example.homework1.animals;

public class Cat extends Mammal{

    private Wool wool;

    protected Cat(Spine spine, Wool wool) {
        super(spine);
        this.wool = wool;
    }

    @Override
    public void speak() {
        System.out.println("MEOW!");
    }

    @Override
    public void breastfeed() {
        System.out.println("Cat is breastfeeding its babies");
    }
}
