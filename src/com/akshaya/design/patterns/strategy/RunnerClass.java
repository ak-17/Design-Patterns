package com.akshaya.design.patterns.strategy;


import com.akshaya.design.patterns.strategy.fly.HighFlyBehaviour;
import com.akshaya.design.patterns.strategy.fly.LowFlyBehaviour;
import com.akshaya.design.patterns.strategy.fly.NoFlyBehaviour;
import com.akshaya.design.patterns.strategy.quack.CityQuackBehaviour;
import com.akshaya.design.patterns.strategy.quack.WildQuackBehaviour;

public class RunnerClass {



    public static void main(String[] args) {

        Duck wildDuck = new Duck(new HighFlyBehaviour(),new WildQuackBehaviour());
        Duck cityDuck = new Duck(new LowFlyBehaviour(),new CityQuackBehaviour());

        Duck rubberDuck = new Duck(new NoFlyBehaviour(),new CityQuackBehaviour());

        System.out.println(wildDuck.fly());

    }



}
