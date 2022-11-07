package observerpattern.observers;

public class ValueLoweredObserver extends Observer {

    private int previousValue;
    @Override
    public void update(int newValue) {
        if (newValue < previousValue) {
            System.out.println(newValue);
        }
        previousValue = newValue;

    }
}
