package observerpattern;

import observerpattern.observers.ByTenChangedObserver;
import observerpattern.observers.ConcreteValueObserver;
import observerpattern.observers.ValueLoweredObserver;
import observerpattern.subject.Subject;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        ConcreteValueObserver concreteValueObserver = new ConcreteValueObserver();
        ValueLoweredObserver valueLoweredObserver = new ValueLoweredObserver();
        ByTenChangedObserver byTenChangedObserver = new ByTenChangedObserver();
        subject.registerObserver(concreteValueObserver);
        subject.registerObserver(valueLoweredObserver);
        subject.registerObserver(byTenChangedObserver);
        subject.setValue(500);
        subject.broadcastValue();
        subject.setValue(400);
        subject.broadcastValue();
        subject.setValue(390);
        subject.broadcastValue();
    }
}
