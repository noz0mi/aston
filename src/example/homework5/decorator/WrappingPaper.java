package example.homework5.decorator;

public class WrappingPaper extends FlowerDecorator {

    public WrappingPaper(Flower flower) {
        this.flower = flower;
    }

    @Override
    public String getDescription() {
        return flower.getDescription() + ", Wrapping paper";
    }

    @Override
    public int cost() {
        return flower.cost() + 50;
    }
}
