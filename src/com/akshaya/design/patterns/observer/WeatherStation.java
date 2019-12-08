package com.akshaya.design.patterns.observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements IObservable<Integer> {

    Set<IObserver<Integer>> observerSet;

    private Integer temperature;

    public WeatherStation() {
        observerSet = new HashSet<>();
        temperature=0;
    }

    public void increaseTemperature() {
        temperature++;
        notifyObservers();
    }

    public void decreaseTemperature() {
        temperature--;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observerSet.forEach(observer -> observer.update(temperature));
    }

    @Override
    public void addObserver(IObserver<Integer> observer) {
        observerSet.add(observer);
    }

    @Override
    public void removeObserver(IObserver<Integer> observer) {
        observerSet.remove(observer);
    }


}
