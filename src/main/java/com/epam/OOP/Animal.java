package com.epam.OOP;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        final String A = "a";
        final String NO = "no";
        final String PAWS = "paws";
        final String PAW = "paw";
        return String.format("This animal is mostly %s. It has %d %s and %s fur.", color, numberOfPaws, numberOfPaws == 1 ? PAW : PAWS,hasFur ? A : NO);
    }
}
