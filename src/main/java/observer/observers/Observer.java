package observerpattern.observers;

import observerpattern.subject.Subject;

public abstract class Observer {

    private Subject subject;

    abstract public void update(int newValue);
}
