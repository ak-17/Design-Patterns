package com.akshaya.design.patterns.observer;

public class PhoneWeatherApp implements IObserver<Integer> {


    Integer temperature = 0;

    public void display() {
        System.out.println("phone: weather temperature is "+this.temperature);
    }


    @Override
    public void update(Integer data) {
        this.temperature = data;
        display();
    }
}
