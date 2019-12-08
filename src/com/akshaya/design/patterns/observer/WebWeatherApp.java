package com.akshaya.design.patterns.observer;

public class WebWeatherApp implements IObserver<Integer> {

    Integer temperature = 0;

    public void display() {
        System.out.println("web: weather temperature is "+this.temperature);
    }

    @Override
    public void update(Integer data) {
        this.temperature = data;
        display();
    }
}
