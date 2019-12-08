package com.akshaya.design.patterns.strategy;

import com.akshaya.design.patterns.strategy.fly.IFlyBehaviour;
import com.akshaya.design.patterns.strategy.quack.IQuackBehaviour;

public class Duck {

    IQuackBehaviour quackBehaviour;
    IFlyBehaviour flyBehaviour;

    public Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public String fly() {
        return this.flyBehaviour.fly();
    }

    public String quack() {
        return this.quackBehaviour.quack();
    }


}
