package example.homework5.decorator;

public class Hydrangea extends Flower{

    public Hydrangea(int amount) {
        this.amount = amount;
        description = "Hydrangea";
    }

    @Override
    public int cost() {
        return 400 * amount;
    }
}
