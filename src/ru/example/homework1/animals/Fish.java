package ru.example.homework1.animals;

public class Fish extends Animal implements Aquatic{

    public Fish() {
    }

    @Override
    public void speak() {
        System.out.println("Fish is bubbling");
    }

    @Override
    public void waterBreath() {
        System.out.println("Fish obviously breathes under water");
    }

    @Override
    public void controlTemperature() {
        System.out.println("Fish doesn't get cold in the water and regulates its temperature");
    }
}
