package org.practice.drinkformood.exception;

public class DrinkNotFoundException extends RuntimeException {
    public DrinkNotFoundException(String message) {
        super(message);
    }
}
