package com.model.day2.coffeshop.exceptions;

public class InsufficientAdditions extends RuntimeException {
    public InsufficientAdditions(String additionName) {
        super("Brakuje dodatku: " + additionName);
    }
}
