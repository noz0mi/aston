package example.homework5.adapter;

public class JapaneseAdapter implements EuropeanSocket{

    private JapaneseSocket plug;

    public JapaneseAdapter(JapaneseSocket plug) {
        this.plug = plug;
    }
    @Override
    public void euroPlugIn() {
        plug.jpnPlugIn();
    }
}
