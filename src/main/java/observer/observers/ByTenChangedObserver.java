package observerpattern.observers;

public class ByTenChangedObserver extends Observer{

    private int previousValue;


    @Override
    public void update(int newValue) {
        if (Math.abs(Math.abs(newValue) - Math.abs(previousValue)) <= 10) {
            System.out.println(newValue);
        }
        previousValue = newValue;
    }
}
