package com.akshaya.design.patterns.strategy.fly;

public class LowFlyBehaviour implements IFlyBehaviour {

    @Override
    public String fly() {
        return "Low Fly";
    }
}
