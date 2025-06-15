package example.homework1.animals;

public class Whale extends Mammal implements Aquatic{

    protected Whale(Spine spine) {
        super(spine);
    }

    @Override
    public void waterBreath() {
        System.out.println("Whale can breathe under water");
    }

    @Override
    public void controlTemperature() {
        System.out.println("Whale controls its body temperature");
    }

    @Override
    public void breastfeed() {
        System.out.println("Whale is breastfeeding its baby");
    }

    @Override
    public void speak() {
        System.out.println("Whale sings its beautiful song");
    }
}
