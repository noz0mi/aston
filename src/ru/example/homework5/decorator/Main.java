package ru.example.homework5.decorator;

public class Main {
    public static void main(String[] args) {
        Flower bouquet1 = new Hydrangea(2, 400);
        Flower bouquet2 = new Lily(3, 350);
        bouquet1 = new WrappingPaper(bouquet1, 50);
        System.out.println("Bouquet total cost = " + bouquet1.cost());
        System.out.println(bouquet1.getDescription());
        bouquet1 = new Ribbons(bouquet1, 25);
        System.out.println("Bouquet total cost = " + bouquet1.cost());
        System.out.println(bouquet1.getDescription());
    }
}
