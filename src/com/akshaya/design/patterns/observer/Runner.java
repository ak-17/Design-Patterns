package com.akshaya.design.patterns.observer;

public class Runner {

    public static void main(String[] args) {

        // Initializing weather station ** observable
        WeatherStation weatherStation = new WeatherStation();

        // Initializing weather apps ** observers
        PhoneWeatherApp phoneWeatherApp = new PhoneWeatherApp();
        WebWeatherApp webWeatherApp = new WebWeatherApp();

        // registering observers
        weatherStation.addObserver(phoneWeatherApp);
        weatherStation.addObserver(webWeatherApp);

        // when weather updates observers are notified
        weatherStation.increaseTemperature();
        weatherStation.increaseTemperature();
        weatherStation.decreaseTemperature();

        // removing an observer
        weatherStation.removeObserver(webWeatherApp);

        weatherStation.increaseTemperature();
        weatherStation.increaseTemperature();
    }
}
