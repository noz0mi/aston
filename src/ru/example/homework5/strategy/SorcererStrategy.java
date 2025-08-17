package ru.example.homework5.strategy;

public class SorcererStrategy implements Strategy {

    private int healthPoints;
    private int manaPoints;
    private int potionAmount;
    private int abilityPower;
    private boolean healingAbilities;

    public SorcererStrategy(int potionAmount, int manaPoints, int healthPoints, int abilityPower, boolean healingAbilities) {
        this.potionAmount = potionAmount;
        this.manaPoints = manaPoints;
        this.healthPoints = healthPoints;
        this.abilityPower = abilityPower;
        this.healingAbilities = healingAbilities;
    }

    public boolean checkMana() {
        if (manaPoints <= 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void attack() {
        double damage = abilityPower * Math.random() * 10;
        System.out.println("Sorcerer attacks with " + damage + " damage");
    }

    @Override
    public void heal() {
        if (checkMana() && healingAbilities) {
            manaPoints -= 10;
            healthPoints += 25;
        } else if (potionAmount >= 1) {
            potionAmount--;
            healthPoints += 30;
        } else {
            System.out.println("Out of potions and mana");
        }
    }
}
