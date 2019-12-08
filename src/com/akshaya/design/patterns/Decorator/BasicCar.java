package com.akshaya.design.patterns.Decorator;

public class BasicCar implements Car {

    @Override
    public int cost() {
        return 1;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling Basic Car");
    }
}
