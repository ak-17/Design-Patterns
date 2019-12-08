package com.akshaya.design.patterns.Decorator;

public class SportsCarDecorator extends CarDecorator {

    public SportsCarDecorator(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        return super.cost()+8;
    }


    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sports Car features");
    }
}
