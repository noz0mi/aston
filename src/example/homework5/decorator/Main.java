package example.homework5.decorator;

public class Main {
    public static void main(String[] args) {
        Flower bouquet1 = new Hydrangea(2);
        Flower bouquet2 = new Lily(3);
        bouquet1 = new WrappingPaper(bouquet1);
        System.out.println("Bouquet total cost = " + bouquet1.cost());
        System.out.println(bouquet1.getDescription());
        bouquet1 = new Ribbons(bouquet2);
        System.out.println("Bouquet total cost = " + bouquet1.cost());
        System.out.println(bouquet1.getDescription());
    }
}
