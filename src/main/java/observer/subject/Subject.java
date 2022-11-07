package observerpattern.subject;

import observerpattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int value;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void broadcastValue() {
        for(Observer observer : observers) {
            observer.update(value);
        }
    }
}
