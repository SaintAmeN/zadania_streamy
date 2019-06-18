package com.model.day2.coffeshop;

import java.util.Arrays;
import java.util.List;

public enum CoffeeType {
    ESPRESSO(4, 30.0, Arrays.asList()),
    DOPPIO(7, 60.0, Arrays.asList()),
    TRIPPLO(10, 90.0, Arrays.asList()),
    RITRETTO(5, 70.0, Arrays.asList()),
    CAPPUCCINO(3, 15.5, Arrays.asList(new CoffeeAddition("Whipped milk", 30.0))),
    AMERICANO(3, 30.0, Arrays.asList(new CoffeeAddition("Water", 10.0))),
    MACCHIATO(4, 40.0, Arrays.asList(new CoffeeAddition("Whipped milk", 20.0))),
    IRISH(6, 30.0, Arrays.asList(new CoffeeAddition("Whipped cream", 15.0), new CoffeeAddition("Whiskey", 20.0))),
    BREVE(6, 25.0, Arrays.asList(new CoffeeAddition("Milk", 20.0), new CoffeeAddition("Cream", 20.0))),
    MOCHA(5, 20.0, Arrays.asList(new CoffeeAddition("Whipped cream", 10.0), new CoffeeAddition("Milk", 10.0), new CoffeeAddition("Chocolate", 10.0))),
    MEAD_RAF(3, 2, Arrays.asList(new CoffeeAddition("Whipped milk", 15.0), new CoffeeAddition("Honey", 10.0))),
    ROMANO(3, 2, Arrays.asList(new CoffeeAddition("Lemon juice", 13.5))),
    LATTE(3, 2, Arrays.asList(new CoffeeAddition("Milk", 10.0), new CoffeeAddition("Whipped milk", 15.0)));

    private int power;                  // moc kawy, w skali do 10
    private double coffeeBeansAmount;        // ilość kawy w gramach
    private List<CoffeeAddition> additions; // dodatki

    CoffeeType(int power, double coffeBeansAmount, List<CoffeeAddition> additions) {
        this.power = power;
        this.coffeeBeansAmount = coffeBeansAmount;
        this.additions = additions;
    }
}
