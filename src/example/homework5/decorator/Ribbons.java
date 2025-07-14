package example.homework5.decorator;

public class Ribbons extends FlowerDecorator {

    public Ribbons(Flower flower) {
        this.flower = flower;
    }

    @Override
    public String getDescription() {
        return flower.getDescription() + ", Ribbons";
    }

    @Override
    public int cost() {
        return flower.cost() + 20;
    }
}
