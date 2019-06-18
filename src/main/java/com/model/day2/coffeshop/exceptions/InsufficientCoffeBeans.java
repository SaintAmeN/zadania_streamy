package com.model.day2.coffeshop.exceptions;

public class InsufficientCoffeBeans extends Exception {
    public InsufficientCoffeBeans(String coffeBeanName, double ilosc) {
        super("Brakuje ziarenek: " + coffeBeanName + " w ilości: "+ ilosc);
    }
}
