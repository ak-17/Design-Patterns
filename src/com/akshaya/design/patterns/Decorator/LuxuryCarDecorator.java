package com.akshaya.design.patterns.Decorator;

public class LuxuryCarDecorator extends CarDecorator {

    LuxuryCarDecorator(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        return super.cost()+3;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Luxury Items to car");
    }
}
