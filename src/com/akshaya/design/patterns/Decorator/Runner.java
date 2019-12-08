package com.akshaya.design.patterns.Decorator;

public class Runner {

    public static void main(String[] args) {

        // decorating sports car features to basic car
        Car sportsCar = new SportsCarDecorator(new BasicCar());
        sportsCar.assemble();
        System.out.println("sports car cost is : " + sportsCar.cost());

        // decorating luxury car features to basic car;
        Car luxuryCar = new LuxuryCarDecorator(new BasicCar());
        luxuryCar.assemble();
        System.out.println("luxury car cost is : " + luxuryCar.cost());

        // decorating sports car features to luxury car to basic car;
        Car sportsLuxuryCar = new SportsCarDecorator(new LuxuryCarDecorator(new BasicCar()));
        sportsLuxuryCar.assemble();
        System.out.println("sports luxury car cost is : " + sportsLuxuryCar.cost());
        

    }

}
