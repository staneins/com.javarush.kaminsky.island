package com.javarush.kaminsky.entity;

public class Duck extends Herbivore {
    public Duck(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded) {
        super(1, 200, 4, 0.15);
    }
}
