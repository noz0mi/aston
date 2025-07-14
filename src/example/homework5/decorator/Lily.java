package example.homework5.decorator;

public class Lily extends Flower{

    public Lily(int amount) {
        this.amount = amount;
        description = "Lily";
    }

    @Override
    public int cost() {
        return 350 * amount;
    }
}
