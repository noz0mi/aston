package ru.example.homework5.strategy;

public class ArcherStrategy implements Strategy {

    private int healthPoints;
    private int attackDamage;
    private int durabilityPoints;
    private int potionAmount;

    public ArcherStrategy(int healthPoints, int attackDamage, int durabilityPoints, int potionAmount) {
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        this.durabilityPoints = durabilityPoints;
        this.potionAmount = potionAmount;
    }

    @Override
    public void attack() {
        double damage = attackDamage * Math.random() * 10;
        System.out.println("Archer attacks with " + damage + " damage");
    }

    @Override
    public void heal() {
        if (potionAmount >= 1) {
            potionAmount--;
            healthPoints += 30;
        } else {
            System.out.println("No potions left to heal");
        }
    }
}
