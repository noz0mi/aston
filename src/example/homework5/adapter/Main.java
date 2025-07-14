package example.homework5.adapter;

public class Main {
    public static void main(String[] args) {
        EuropeanSocket euroPlug = new EuropeanPlug();
        JapaneseSocket jpnPlug = new JapanesePlug();
        EuropeanSocket japaneseAdapter = new JapaneseAdapter(jpnPlug);
        System.out.println("Plugging european plug in european socket");
        euroPlug.euroPlugIn();
        System.out.println("Plugging japanese plug in european socket");
        japaneseAdapter.euroPlugIn();
    }
}
