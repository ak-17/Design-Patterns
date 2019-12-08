package com.akshaya.design.patterns.strategy.quack;

public class WildQuackBehaviour implements IQuackBehaviour {

    @Override
    public String quack() {
        return "wild quacking";
    }
}
