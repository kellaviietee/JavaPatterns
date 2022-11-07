package observerpattern.observers;

public class ConcreteValueObserver extends Observer{
    @Override
    public void update(int newValue) {
        System.out.println(newValue);
    }
}
