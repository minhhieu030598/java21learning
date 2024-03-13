package org.minhhieu.service.observer.transaction;

import java.util.ArrayList;
import java.util.List;

public class TxnTypeObserver {
    private static final List<Observer> observers = new ArrayList<>();

    public TxnTypeObserver() {

    }

    public static void add(Observer observer) {
        observers.add(observer);
    }

    public static void inform() {
        observers.forEach(Observer::update);
    }
}
