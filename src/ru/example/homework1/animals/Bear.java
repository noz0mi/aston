package ru.example.homework1.animals;

public class Bear extends Mammal{

    private Wool wool;

    public Bear(Spine spine, Wool wool) {
        super(spine);
        this.wool = wool;
    }

    @Override
    public void speak() {
        System.out.println("Bear is roaring");
    }

    @Override
    public void breastfeed() {
        System.out.println("Bear is breastfeeding its babies");
    }
}
