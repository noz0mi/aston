package example.homework5.decorator;

public abstract class Flower {

    protected String description;
    protected int amount;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
